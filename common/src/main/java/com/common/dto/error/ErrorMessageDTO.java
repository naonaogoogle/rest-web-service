package com.common.dto.error;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-05 20:36
 */
@Data
@Builder
@AllArgsConstructor
@ApiModel(description = "Error status message")
public class ErrorMessageDTO {

    @ApiModelProperty(notes = "Contains the same Http status code returned by the server",required = true)
    private Integer status;

    @ApiModelProperty(notes = "Application specific error code",required = true)
    private Integer code;

    @ApiModelProperty(notes = "Message describing the error",required = true)
    private String message;

}
