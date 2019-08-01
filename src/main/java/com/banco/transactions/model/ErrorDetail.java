package com.banco.transactions.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T13:02:05.655-05:00")

public class ErrorDetail {
    @JsonProperty("code")
    private String code = null;

    @JsonProperty("detail")
    private String detail = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("title")
    private String title = null;

    public ErrorDetail code(String code) {
        this.code = code;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ErrorDetail detail(String detail) {
        this.detail = detail;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ErrorDetail id(String id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ErrorDetail source(String source) {
        this.source = source;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ErrorDetail status(String status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ErrorDetail title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
