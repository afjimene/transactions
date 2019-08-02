package com.banco.transactions.api;

import com.banco.transactions.model.TransactionFilterRequest;
import com.banco.transactions.model.TransactionGroupRequest;
import com.banco.transactions.model.TransactionListRequest;
import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TransactionsApiController implements TransactionsApi {

    @EndpointInject(uri = "direct:transaction-map")
    private FluentProducerTemplate producerTemplateMap;

    @EndpointInject(uri = "direct:transaction-filter")
    private FluentProducerTemplate producerTemplateFilter;

    @EndpointInject(uri = "direct:transaction-group")
    private FluentProducerTemplate producerTemplateGroup;

    @Override
    public <T> ResponseEntity<?> transactionList(@Valid TransactionListRequest body) {
        return (ResponseEntity<T>) producerTemplateMap.withBody(body).request();
    }

    @Override
    public <T> ResponseEntity<?> transactionByFilter(@Valid TransactionFilterRequest body) {
        return (ResponseEntity<T>) producerTemplateFilter.withBody(body).request();
    }

    @Override
    public <T> ResponseEntity<?> transactionGroup(@Valid TransactionGroupRequest body) {
        return (ResponseEntity<T>) producerTemplateGroup.withBody(body).request();
    }
}
