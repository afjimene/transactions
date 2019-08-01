package com.banco.transactions.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionGD {

    public TransactionGD(String id, String accountId, String counterpartyAccount, String counterpartyName,
                         String counterPartyLogoPath, Double instructedAmount, String instructedCurrency,
                         Double transactionAmount, String transactionCurrency, String transactionType,
                         String description) {
        this.id = id;
        this.accountId = accountId;
        this.counterpartyAccount = counterpartyAccount;
        this.counterpartyName = counterpartyName;
        this.counterPartyLogoPath = counterPartyLogoPath;
        this.instructedAmount = instructedAmount;
        this.instructedCurrency = instructedCurrency;
        this.transactionAmount = transactionAmount;
        this.transactionCurrency = transactionCurrency;
        this.transactionType = transactionType;
        this.description = description;
    }

    @JsonProperty("id")
    private String id;

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("counterpartyAccount")
    private String counterpartyAccount;

    @JsonProperty("counterpartyName")
    private String counterpartyName;

    @JsonProperty("counterPartyLogoPath")
    private String counterPartyLogoPath;

    @JsonProperty("instructedAmount")
    private Double instructedAmount;

    private String instructedCurrency;
    private Double transactionAmount;
    private String transactionCurrency;
    private String transactionType;
    private String description;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("counterpartyAccount")
    public String getCounterpartyAccount() {
        return counterpartyAccount;
    }

    @JsonProperty("counterpartyAccount")
    public void setCounterpartyAccount(String counterpartyAccount) {
        this.counterpartyAccount = counterpartyAccount;
    }

    public String getCounterpartyName() {
        return counterpartyName;
    }

    public void setCounterpartyName(String counterpartyName) {
        this.counterpartyName = counterpartyName;
    }

    public String getCounterPartyLogoPath() {
        return counterPartyLogoPath;
    }

    public void setCounterPartyLogoPath(String counterPartyLogoPath) {
        this.counterPartyLogoPath = counterPartyLogoPath;
    }

    public Double getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(Double instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public String getInstructedCurrency() {
        return instructedCurrency;
    }

    public void setInstructedCurrency(String instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
