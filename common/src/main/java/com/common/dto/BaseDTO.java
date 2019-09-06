package com.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 12:56
 */
@Getter
@EqualsAndHashCode(of = "id", doNotUseGetters = true)
@ApiModel(description = "The base object")
public abstract class BaseDTO implements Serializable {


    @ApiModelProperty(notes = "The ID", required = true)
    private final String id;

    BaseDTO(final Builder builder) {
        this.id = builder.bId;
    }


    public abstract static class Builder<T extends Builder> {
        private String bId;

        protected Builder() {
        }

        public T withId(final String id) {
            this.bId = id;
            return (T) this;
        }
    }

}
