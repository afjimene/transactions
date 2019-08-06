package com.banco.transactions.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class TransactionGroupResponse {

    List<TransactionGD> transactions;

    @ApiModelProperty(required = true, value = "List of grouped transactions.")
    public List<TransactionGD> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionGD> transactions) {
        this.transactions = transactions;
    }
}
