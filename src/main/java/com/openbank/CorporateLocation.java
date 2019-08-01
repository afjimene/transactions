
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
 * The Corporate_location Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "date",
    "user"
})
public class CorporateLocation {

    /**
     * The Latitude Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    private Double latitude = 0.0D;
    /**
     * The Longitude Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    private Double longitude = 0.0D;
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
    private User user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Latitude Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * The Latitude Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * The Longitude Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * The Longitude Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
    public User getUser() {
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
    public void setUser(User user) {
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
