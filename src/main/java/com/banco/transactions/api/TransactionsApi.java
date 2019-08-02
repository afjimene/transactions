package com.banco.transactions.api;

import com.banco.transactions.model.*;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T13:02:05.655-05:00")

@Api(value = "transactions")
@RequestMapping(value = "/base/v1")
public interface TransactionsApi {

    @ApiOperation(value = "Transactions", nickname = "transactionList", notes = "Transaction in the account",
            response = TransactionListResponse.class, tags = {"transactions-list-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Inquery step success", response = TransactionListResponse.class),
            @ApiResponse(code = 424, message = "Invalid Input. please put correct request", response = Errors.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Errors.class) })
    @RequestMapping(value = "/transactionList",
            produces = { MediaType.APPLICATION_JSON_UTF8_VALUE },
            consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE },
            method = RequestMethod.POST)
    <T> ResponseEntity<?> transactionList(
            @ApiParam(value = "body", required = true) @Valid @RequestBody TransactionListRequest body);

    @ApiOperation(value = "TransactionsByFilter", nickname = "transactionByFilter", notes = "Transaction by filter",
            response = TransactionFilterResponse.class, tags = {"transactions-filter-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Inquery step success", response = TransactionFilterResponse.class),
            @ApiResponse(code = 424, message = "Invalid Input. please put correct request", response = Errors.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Errors.class) })
    @RequestMapping(value = "/transactionFilter",
            produces = { MediaType.APPLICATION_JSON_UTF8_VALUE },
            consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE },
            method = RequestMethod.POST)
    <T> ResponseEntity<?> transactionByFilter(
            @ApiParam(value = "body", required = true) @Valid @RequestBody TransactionFilterRequest body);

    @ApiOperation(value = "GroupByTransactions", nickname = "groupByTransaction", notes = "Group by transactions",
            response = TransactionGroupResponse.class, tags = {"transactions-group-api-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Inquery step success", response = TransactionGroupResponse.class),
            @ApiResponse(code = 424, message = "Invalid Input. please put correct request", response = Errors.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Errors.class) })
    @RequestMapping(value = "/transactionGroup",
            produces = { MediaType.APPLICATION_JSON_UTF8_VALUE },
            consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE },
            method = RequestMethod.POST)
    <T> ResponseEntity<?> transactionGroup(
            @ApiParam(value = "body", required = true) @Valid @RequestBody TransactionGroupRequest body);
}
