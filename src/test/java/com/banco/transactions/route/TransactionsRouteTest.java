package com.banco.transactions.route;

import com.banco.transactions.model.TransactionFilterRequest;
import com.banco.transactions.model.TransactionGD;
import com.banco.transactions.model.TransactionListRequest;
import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TransactionsRouteTest extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() {
        return new TransactionsRoute();
    }

    @Test
    public void testTransactionList() throws Exception {

        //Arrange
        RouteDefinition routeDefinition = context.getRouteDefinition("transaction-list");
        routeDefinition.adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() {

                interceptSendToEndpoint("https4:*")
                        .skipSendToOriginalEndpoint()
                        .to("mock:http4")
                        .transform().constant("resource:classpath:response.json");
            }
        });

        MockEndpoint mockEndpointHttp4 = getMockEndpoint("mock:http4");
        mockEndpointHttp4.expectedHeaderReceived(Exchange.HTTP_METHOD, "GET");
        mockEndpointHttp4.expectedMessageCount(1);

        TransactionListRequest request = new TransactionListRequest();

        //Act
        ResponseEntity<List<TransactionGD>> response = (ResponseEntity<List<TransactionGD>>)fluentTemplate.withBody(request)
                .to("direct:transaction-map")
                .request();

        //Assert
        mockEndpointHttp4.assertIsSatisfied();
        assertEquals(50, response.getBody().size());
    }

    @Test
    public void testTransactionFilter() throws Exception {

        //Arrange
        RouteDefinition routeDefinition = context.getRouteDefinition("transaction-list");
        routeDefinition.adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() {

                interceptSendToEndpoint("https4:*")
                        .skipSendToOriginalEndpoint()
                        .to("mock:http4")
                        .transform().constant("resource:classpath:response.json");
            }
        });

        MockEndpoint mockEndpointHttp4 = getMockEndpoint("mock:http4");
        mockEndpointHttp4.expectedHeaderReceived(Exchange.HTTP_METHOD, "GET");
        mockEndpointHttp4.expectedMessageCount(1);

        TransactionFilterRequest request = new TransactionFilterRequest();
        request.setTransactionType("SANDBOX_TAN");

        //Act
        ResponseEntity<List<TransactionGD>> response = (ResponseEntity<List<TransactionGD>>)fluentTemplate.withBody(request)
                .to("direct:transaction-filter")
                .request();

        //Assert
        mockEndpointHttp4.assertIsSatisfied();
        assertEquals(2, response.getBody().size());
    }
}
