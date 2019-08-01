
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
 * The Details Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "description",
    "posted",
    "completed",
    "new_balance",
    "value"
})
public class Details {

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type = "";
    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private String description = "";
    /**
     * The Posted Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("posted")
    private String posted = "";
    /**
     * The Completed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed")
    private String completed = "";
    /**
     * The New_balance Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("new_balance")
    private NewBalance newBalance;
    /**
     * The Value Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private Value value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The Type Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The Posted Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("posted")
    public String getPosted() {
        return posted;
    }

    /**
     * The Posted Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("posted")
    public void setPosted(String posted) {
        this.posted = posted;
    }

    /**
     * The Completed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed")
    public String getCompleted() {
        return completed;
    }

    /**
     * The Completed Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed")
    public void setCompleted(String completed) {
        this.completed = completed;
    }

    /**
     * The New_balance Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("new_balance")
    public NewBalance getNewBalance() {
        return newBalance;
    }

    /**
     * The New_balance Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("new_balance")
    public void setNewBalance(NewBalance newBalance) {
        this.newBalance = newBalance;
    }

    /**
     * The Value Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    /**
     * The Value Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
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
