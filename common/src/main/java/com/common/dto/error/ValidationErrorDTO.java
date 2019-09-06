package com.common.dto.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-05 20:34
 */
@Data
@NoArgsConstructor
@ApiModel(description = "An object with a list of erroneous fields ")
public class ValidationErrorDTO {

    @JsonProperty("filed_errors")
    @ApiModelProperty(notes = "The list of errors")
    private List<ErrorFieldDTO> filedErrors = new ArrayList<>();

    public void addFieldError(final String path,final String message) {
        final ErrorFieldDTO error = new ErrorFieldDTO(path,message);
        filedErrors.add(error);
    }


}
