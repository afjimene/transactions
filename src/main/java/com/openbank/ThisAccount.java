
package com.openbank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The This_account Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "holders",
    "number",
    "kind",
    "IBAN",
    "swift_bic",
    "bank"
})
public class ThisAccount {

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id = "";
    /**
     * The Holders Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holders")
    private List<Holder> holders = null;
    /**
     * The Number Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    private String number = "";
    /**
     * The Kind Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    private String kind = "";
    /**
     * The Iban Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IBAN")
    private String iBAN = "";
    /**
     * The Swift_bic Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("swift_bic")
    private String swiftBic = "";
    /**
     * The Bank Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bank")
    private Bank bank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Holders Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holders")
    public List<Holder> getHolders() {
        return holders;
    }

    /**
     * The Holders Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holders")
    public void setHolders(List<Holder> holders) {
        this.holders = holders;
    }

    /**
     * The Number Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * The Number Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * The Kind Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * The Kind Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * The Iban Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IBAN")
    public String getIBAN() {
        return iBAN;
    }

    /**
     * The Iban Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("IBAN")
    public void setIBAN(String iBAN) {
        this.iBAN = iBAN;
    }

    /**
     * The Swift_bic Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("swift_bic")
    public String getSwiftBic() {
        return swiftBic;
    }

    /**
     * The Swift_bic Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("swift_bic")
    public void setSwiftBic(String swiftBic) {
        this.swiftBic = swiftBic;
    }

    /**
     * The Bank Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bank")
    public Bank getBank() {
        return bank;
    }

    /**
     * The Bank Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("bank")
    public void setBank(Bank bank) {
        this.bank = bank;
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
