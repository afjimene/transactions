
package com.openbank;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The New_balance Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "amount"
})
public class NewBalance {

    /**
     * The Currency Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    private String currency = "";
    /**
     * The Amount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    private String amount = "";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Currency Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * The Currency Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The Amount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * The Amount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
