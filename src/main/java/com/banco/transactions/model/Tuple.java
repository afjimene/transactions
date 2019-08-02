package com.banco.transactions.model;

public class Tuple {

    public Tuple (String type, Double value) {
        this.type = type;
        this.value = value;
    }

    private String type;
    private Double value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return type + "," + value.toString();
    }
}
