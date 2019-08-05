package com.banco.transactions.route;

import com.banco.transactions.model.*;
import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.AdviceWithRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.http.HttpException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TransactionsRouteTest extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() {
        return new TransactionsRoute();
    }

    void init() throws Exception {
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
    }

    @Test
    public void testTransactionList() throws Exception {

        //Arrange
        init();
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
        init();
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

    @Test
    public void testTransactionGroup() throws Exception {

        //Arrange
        init();
        MockEndpoint mockEndpointHttp4 = getMockEndpoint("mock:http4");
        mockEndpointHttp4.expectedHeaderReceived(Exchange.HTTP_METHOD, "GET");
        mockEndpointHttp4.expectedMessageCount(1);

        TransactionGroupRequest request = new TransactionGroupRequest();

        //Act
        ResponseEntity<List<TransactionGD>> response = (ResponseEntity<List<TransactionGD>>)fluentTemplate.withBody(request)
                .to("direct:transaction-group")
                .request();

        //Assert
        mockEndpointHttp4.assertIsSatisfied();
        assertEquals(3, response.getBody().size());
    }

    @Test
    public void testHttpError() throws Exception {

        RouteDefinition routeDefinition = context.getRouteDefinition("transaction-list");
        routeDefinition.adviceWith(context, new AdviceWithRouteBuilder() {
            @Override
            public void configure() {

                interceptSendToEndpoint("https4:*")
                        .skipSendToOriginalEndpoint()
                        .to("mock:http4")
                        .process(exchange ->  {
                            throw new HttpException();
                        });
            }
        });

        MockEndpoint mockEndpointHttp4 = getMockEndpoint("mock:http4");
        mockEndpointHttp4.expectedHeaderReceived(Exchange.HTTP_METHOD, "GET");
        mockEndpointHttp4.expectedMessageCount(1);

        TransactionListRequest request = new TransactionListRequest();

        //Act
        Object response = (ResponseEntity<List<TransactionGD>>)fluentTemplate.withBody(request)
                .to("direct:transaction-map")
                .request();

        //Assert
        mockEndpointHttp4.assertIsSatisfied();
        assertTrue(response instanceof ResponseEntity);
        ResponseEntity<?> responseEntity = (ResponseEntity<?>)response;
        assertTrue(responseEntity.getBody() instanceof Errors);
    }
}
