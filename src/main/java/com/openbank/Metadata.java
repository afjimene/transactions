
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
 * The Metadata Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "public_alias",
    "private_alias",
    "more_info",
    "URL",
    "image_URL",
    "open_corporates_URL",
    "corporate_location",
    "physical_location"
})
public class Metadata {

    /**
     * The Public_alias Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("public_alias")
    private String publicAlias = "";
    /**
     * The Private_alias Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("private_alias")
    private String privateAlias = "";
    /**
     * The More_info Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("more_info")
    private String moreInfo = "";
    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("URL")
    private String uRL = "";
    /**
     * The Image_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("image_URL")
    private String imageURL = "";
    /**
     * The Open_corporates_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_corporates_URL")
    private String openCorporatesURL = "";
    /**
     * The Corporate_location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("corporate_location")
    private CorporateLocation corporateLocation;
    /**
     * The Physical_location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("physical_location")
    private PhysicalLocation physicalLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Public_alias Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("public_alias")
    public String getPublicAlias() {
        return publicAlias;
    }

    /**
     * The Public_alias Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("public_alias")
    public void setPublicAlias(String publicAlias) {
        this.publicAlias = publicAlias;
    }

    /**
     * The Private_alias Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("private_alias")
    public String getPrivateAlias() {
        return privateAlias;
    }

    /**
     * The Private_alias Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("private_alias")
    public void setPrivateAlias(String privateAlias) {
        this.privateAlias = privateAlias;
    }

    /**
     * The More_info Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("more_info")
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * The More_info Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("more_info")
    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("URL")
    public String getURL() {
        return uRL;
    }

    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("URL")
    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    /**
     * The Image_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("image_URL")
    public String getImageURL() {
        return imageURL;
    }

    /**
     * The Image_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("image_URL")
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    /**
     * The Open_corporates_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_corporates_URL")
    public String getOpenCorporatesURL() {
        return openCorporatesURL;
    }

    /**
     * The Open_corporates_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("open_corporates_URL")
    public void setOpenCorporatesURL(String openCorporatesURL) {
        this.openCorporatesURL = openCorporatesURL;
    }

    /**
     * The Corporate_location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("corporate_location")
    public CorporateLocation getCorporateLocation() {
        return corporateLocation;
    }

    /**
     * The Corporate_location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("corporate_location")
    public void setCorporateLocation(CorporateLocation corporateLocation) {
        this.corporateLocation = corporateLocation;
    }

    /**
     * The Physical_location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("physical_location")
    public PhysicalLocation getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * The Physical_location Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("physical_location")
    public void setPhysicalLocation(PhysicalLocation physicalLocation) {
        this.physicalLocation = physicalLocation;
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
