
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
    "value",
    "date",
    "user"
})
public class Tag {

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
     * The Value Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    private String value = "";
    /**
     * The Date Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    private String date = "";
    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("user")
    private User___ user;
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
     * The Value Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
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
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The Date Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * The Date Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("user")
    public User___ getUser() {
        return user;
    }

    /**
     * The User Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("user")
    public void setUser(User___ user) {
        this.user = user;
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
