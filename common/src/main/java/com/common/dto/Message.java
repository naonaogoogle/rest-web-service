package com.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import java.util.Date;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 13:03
 */
@Getter
@ApiModel(description = "Message data")
public abstract class Message extends BaseDTO {

    @ApiModelProperty(notes = "The message subject",required = true)
    private final String subject;
    @ApiModelProperty(notes = "The message text",required = true)
    private final String text;
    @ApiModelProperty(notes = "The message date of sent",required = true)
    private final Date date;

    Message(Builder builder) {
        super(builder);
        this.subject = builder.bSubject;
        this.text = builder.bText;
        this.date = builder.bDate;
    }

    public abstract static class Builder<T extends Builder> extends BaseDTO.Builder<T> {

        private final String bSubject;
        private final String bText;
        private final Date bDate;

        /**
         * Constructor which has required fields.
         *
         * @param subject The message subject
         * @param text The message text
         * @param date The message date of sent
         */
        public Builder(String subject, String text, Date date) {
            this.bSubject = subject;
            this.bText = text;
            this.bDate = date;
        }
    }

}

