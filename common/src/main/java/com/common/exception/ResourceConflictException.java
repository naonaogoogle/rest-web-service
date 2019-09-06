package com.common.exception;

import java.net.HttpURLConnection;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 11:52
 */
public class ResourceConflictException extends ResourceException{

    public ResourceConflictException(final String message, final Throwable cause) {
        super(HttpURLConnection.HTTP_CONFLICT, message, cause);
    }

    public ResourceConflictException(final String message) {
        super(HttpURLConnection.HTTP_CONFLICT, message);
    }

}
