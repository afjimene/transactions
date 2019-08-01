
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
 * The Other_account Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "holder",
    "number",
    "kind",
    "IBAN",
    "swift_bic",
    "bank",
    "metadata"
})
public class OtherAccount {

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
     * The Holder Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holder")
    private Holder_ holder;
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
    private Bank_ bank;
    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    private Metadata metadata;
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
     * The Holder Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holder")
    public Holder_ getHolder() {
        return holder;
    }

    /**
     * The Holder Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("holder")
    public void setHolder(Holder_ holder) {
        this.holder = holder;
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
    public Bank_ getBank() {
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
    public void setBank(Bank_ bank) {
        this.bank = bank;
    }

    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
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
