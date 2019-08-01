
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
 * The Metadata Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "narrative",
    "comments",
    "tags",
    "images",
    "where"
})
public class Metadata_ {

    /**
     * The Narrative Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("narrative")
    private String narrative = "";
    /**
     * The Comments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments")
    private List<Comment> comments = null;
    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    private List<Tag> tags = null;
    /**
     * The Images Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("images")
    private List<Image> images = null;
    /**
     * The Where Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("where")
    private Where where;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Narrative Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("narrative")
    public String getNarrative() {
        return narrative;
    }

    /**
     * The Narrative Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("narrative")
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    /**
     * The Comments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    /**
     * The Comments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * The Tags Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * The Images Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    /**
     * The Images Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * The Where Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("where")
    public Where getWhere() {
        return where;
    }

    /**
     * The Where Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("where")
    public void setWhere(Where where) {
        this.where = where;
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
