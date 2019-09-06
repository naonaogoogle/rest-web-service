package com.common.exception;

import java.net.HttpURLConnection;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 11:48
 */
public class ResourceBadRequestException extends ResourceException {


    public ResourceBadRequestException(final String message, final Throwable cause) {
        super(HttpURLConnection.HTTP_BAD_REQUEST, message, cause);
    }

    public ResourceBadRequestException(final String message) {
        super(HttpURLConnection.HTTP_BAD_REQUEST,message);
    }
}
