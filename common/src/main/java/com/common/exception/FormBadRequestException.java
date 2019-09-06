package com.common.exception;

import com.common.dto.error.ValidationErrorDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-05 20:34
 */
@AllArgsConstructor

public class FormBadRequestException extends RuntimeException {

    @JsonProperty("field_errors")
    private ValidationErrorDTO fieldErrors;

    public ValidationErrorDTO getErrors() {
        return fieldErrors;
    }


}
