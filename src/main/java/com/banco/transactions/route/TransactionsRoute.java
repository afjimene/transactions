package com.banco.transactions.route;

import com.banco.transactions.model.TransactionFilterRequest;
import com.banco.transactions.model.TransactionGD;
import com.banco.transactions.model.Tuple;
import com.openbank.Transactions;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Component
public class TransactionsRoute extends RouteBuilder {

    private static final String TRANSACTION_LIST = "direct:transaction-list";
    private static final String TRANSACTION_TYPE = "transactionType";
    private static final String TRANSACTION_AMOUNT = "transactionAmount";
    private static final String COUNTERPARTY_NAME = "counterpartyName";

    @Override
    public void configure() throws Exception {

        from("direct:transaction-filter")
                .routeId("transaction-filter")
                .process(exchange -> saveRequest.accept(exchange))
                .to(TRANSACTION_LIST)
                .process(exchange -> filter.accept(exchange))
                .end();

        from("direct:transaction-map")
                .routeId("transaction-map")
                .to(TRANSACTION_LIST)
                .process(exchange -> map.accept(exchange))
                .end();

        from("direct:transaction-group")
                .routeId("transaction-group")
                .to(TRANSACTION_LIST)
                .process(exchange -> group.accept(exchange))
                .end();

        from(TRANSACTION_LIST)
                .routeId("transaction-list")
                .removeHeaders("CamelHttp*", "CamelHttp(Method|Path|Query)")
                .setHeader(Exchange.HTTP_METHOD, constant("GET"))
                .setHeader(Exchange.HTTP_PATH, simple("/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions"))
                .setBody(simple(null))
                .to("https4://apisandbox.openbankproject.com")
                .unmarshal().json(JsonLibrary.Jackson, Transactions.class)
                .end();

    }

    private static Consumer<Exchange> filter = exchange -> {

        Transactions transactions = exchange.getIn().getBody(Transactions.class);

        String transactionType = exchange.getProperty(TRANSACTION_TYPE, String.class);
        Double transactionAmount = exchange.getProperty(TRANSACTION_AMOUNT, Double.class);
        String counterpartyName = exchange.getProperty(COUNTERPARTY_NAME, String.class);

        List<TransactionGD> transactionsGD = transactions.getTransactions().stream()
                .filter(transaction -> {
                    boolean validateType = transactionType != null && !transactionType.isEmpty() &&
                        transactionType.equals(transaction.getDetails().getType());
                    boolean validateAmount = transactionAmount != null &&
                            transactionAmount.equals(Double.parseDouble(transaction.getDetails().getValue().getAmount()));
                    boolean validateCounterparty = counterpartyName != null && !counterpartyName.isEmpty() &&
                            transaction.getOtherAccount().getHolder().getName().startsWith(counterpartyName);
                    return validateType || validateAmount || validateCounterparty;
                })
                .map(transaction -> new TransactionGD(transaction.getId(), transaction.getThisAccount().getId(),
                        transaction.getOtherAccount().getNumber(), transaction.getOtherAccount().getHolder().getName(),
                        transaction.getOtherAccount().getMetadata().getImageURL(),
                        Double.parseDouble(transaction.getDetails().getValue().getAmount()),
                        transaction.getDetails().getValue().getCurrency(),
                        Double.parseDouble(transaction.getDetails().getValue().getAmount()),
                        transaction.getDetails().getValue().getCurrency(), transaction.getDetails().getType(),
                        transaction.getDetails().getDescription()))
                .collect(Collectors.toList());

        exchange.getOut().setBody(new ResponseEntity<>(transactionsGD, HttpStatus.OK));
    };

    private static Consumer<Exchange> map = exchange -> {

        Transactions transactions = exchange.getIn().getBody(Transactions.class);

        List<TransactionGD> transactionsGD = transactions.getTransactions().stream()
                .map(transaction -> new TransactionGD(transaction.getId(), transaction.getThisAccount().getId(),
                        transaction.getOtherAccount().getNumber(), transaction.getOtherAccount().getHolder().getName(),
                        transaction.getOtherAccount().getMetadata().getImageURL(),
                        Double.parseDouble(transaction.getDetails().getValue().getAmount()),
                        transaction.getDetails().getValue().getCurrency(),
                        Double.parseDouble(transaction.getDetails().getValue().getAmount()),
                        transaction.getDetails().getValue().getCurrency(), transaction.getDetails().getType(),
                        transaction.getDetails().getDescription()))
                .collect(Collectors.toList());

        exchange.getOut().setBody(new ResponseEntity<>(transactionsGD, HttpStatus.OK));
    };

    private static Consumer<Exchange> saveRequest = exchange -> {

        TransactionFilterRequest request = exchange.getIn().getBody(TransactionFilterRequest.class);

        exchange.setProperty(TRANSACTION_TYPE, request.getTransactionType());
        exchange.setProperty(TRANSACTION_AMOUNT, request.getTransactionAmount());
        exchange.setProperty(COUNTERPARTY_NAME, request.getCounterpartyName());

    };

    private static Consumer<Exchange> group = exchange -> {

        Transactions transactions = exchange.getIn().getBody(Transactions.class);

        List<Tuple> tuples = transactions.getTransactions().stream()
                .map(transaction -> new Tuple(transaction.getDetails().getType() == null ? "" : transaction.getDetails().getType(),
                        Double.parseDouble(transaction.getDetails().getValue().getAmount())))
                .collect(Collectors.toList());

        //tuples.stream().forEach(System.out::println);

        Map <String, Double> grouping = tuples.stream()
                .collect(Collectors.groupingBy(Tuple::getType, Collectors.summingDouble(Tuple::getValue)));

        List<TransactionGD> transactionsGD = grouping.entrySet().stream()
                .map(entry -> new TransactionGD(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        exchange.getOut().setBody(new ResponseEntity<>(transactionsGD, HttpStatus.OK));
    };
}
