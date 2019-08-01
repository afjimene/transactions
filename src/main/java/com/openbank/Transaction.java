
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
 * The Items Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "this_account",
    "other_account",
    "details",
    "metadata"
})
public class Transaction {

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
     * The This_account Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("this_account")
    private ThisAccount thisAccount;
    /**
     * The Other_account Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("other_account")
    private OtherAccount otherAccount;
    /**
     * The Details Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("details")
    private Details details;
    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    private Metadata_ metadata;
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
     * The This_account Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("this_account")
    public ThisAccount getThisAccount() {
        return thisAccount;
    }

    /**
     * The This_account Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("this_account")
    public void setThisAccount(ThisAccount thisAccount) {
        this.thisAccount = thisAccount;
    }

    /**
     * The Other_account Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("other_account")
    public OtherAccount getOtherAccount() {
        return otherAccount;
    }

    /**
     * The Other_account Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("other_account")
    public void setOtherAccount(OtherAccount otherAccount) {
        this.otherAccount = otherAccount;
    }

    /**
     * The Details Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("details")
    public Details getDetails() {
        return details;
    }

    /**
     * The Details Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("details")
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("metadata")
    public Metadata_ getMetadata() {
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
    public void setMetadata(Metadata_ metadata) {
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
