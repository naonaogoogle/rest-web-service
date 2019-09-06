package com.common.exception;

import java.net.HttpURLConnection;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 12:54
 */
public class ResourceServerException extends ResourceException{

    public ResourceServerException(String msg, Throwable cause) {
        super(HttpURLConnection.HTTP_INTERNAL_ERROR, msg, cause);
    }

    public ResourceServerException(String msg) {
        super(HttpURLConnection.HTTP_INTERNAL_ERROR, msg);
    }
}
