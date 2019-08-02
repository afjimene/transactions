package com.banco.transactions.api;

import com.banco.transactions.model.TransactionFilterRequest;
import com.banco.transactions.model.TransactionGD;
import com.banco.transactions.model.TransactionListRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.FluentProducerTemplate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class TransactionsApiControllerTest {

    @InjectMocks
    private TransactionsApiController transactionsApiController;

    @Mock
    private FluentProducerTemplate fluentProducerTemplate;

    @Before
    public void setUp() {

        when(fluentProducerTemplate.withBody(any(TransactionListRequest.class))).thenReturn(fluentProducerTemplate);
        when(fluentProducerTemplate.withBody(any(TransactionFilterRequest.class))).thenReturn(fluentProducerTemplate);

        ReflectionTestUtils.setField(transactionsApiController, "producerTemplateMap", fluentProducerTemplate);
        ReflectionTestUtils.setField(transactionsApiController, "producerTemplateFilter", fluentProducerTemplate);
    }

    @Test
    public void testSuccessList() {

        //Arrange
        List<TransactionGD> transactions = new ArrayList<>();
        Double value = new Double(100D);
        transactions.add(new TransactionGD("1", "id", "counter", "name",
                "logo", value, "COP", value, "COP",
                "type", "desc"));
        when(fluentProducerTemplate.request()).thenReturn(new ResponseEntity<List<TransactionGD>>(transactions, HttpStatus.OK));

        //Act
        ResponseEntity<?> response = transactionsApiController.transactionList(new TransactionListRequest());

        //Assert
        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals("COP", ((List<TransactionGD>)response.getBody()).get(0).getTransactionCurrency());
    }

    @Test
    public void testSuccessFilter() {

        //Arrange
        List<TransactionGD> transactions = new ArrayList<>();
        Double value = new Double(100D);
        transactions.add(new TransactionGD("1", "id", "counter", "name",
                "logo", value, "COP", value, "COP",
                "type", "desc"));
        when(fluentProducerTemplate.request()).thenReturn(new ResponseEntity<List<TransactionGD>>(transactions, HttpStatus.OK));

        TransactionFilterRequest request = new TransactionFilterRequest();
        request.setTransactionType("SANDBOX_TAN");

        //Act
        ResponseEntity<?> response = transactionsApiController.transactionByFilter(request);

        //Assert
        assertNotNull(response);
        assertNotNull(response.getBody());
        assertEquals("COP", ((List<TransactionGD>)response.getBody()).get(0).getTransactionCurrency());
    }
}
