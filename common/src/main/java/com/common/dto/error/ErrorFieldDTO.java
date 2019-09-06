package com.common.dto.error;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-05 20:36
 */
@Data
@AllArgsConstructor
@ApiModel(description = "The object represents an erroneous field")

public class ErrorFieldDTO {

    @ApiModelProperty(notes = "The field`s name", readOnly = true)
    private String field;

    @ApiModelProperty(notes = "The error message",readOnly = true)
    private String message;

}
