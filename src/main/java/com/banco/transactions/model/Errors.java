package com.banco.transactions.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T13:02:05.655-05:00")

public class Errors {

    @JsonProperty("errors")
    @Valid
    private List<ErrorDetail> errors = new ArrayList<ErrorDetail>();

    public Errors errors(List<ErrorDetail> errors) {
        this.errors = errors;
        return this;
    }

    public Errors addErrorsItem(ErrorDetail errorsItem) {
        this.errors.add(errorsItem);
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }

}
