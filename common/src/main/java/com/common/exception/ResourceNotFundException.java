package com.common.exception;

import java.net.HttpURLConnection;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 12:51
 */
public class ResourceNotFundException extends ResourceException {

    public ResourceNotFundException(String msg, Throwable cause) {
        super(HttpURLConnection.HTTP_NOT_FOUND, msg, cause);
    }

    public ResourceNotFundException(String msg) {
        super(HttpURLConnection.HTTP_NOT_FOUND, msg);
    }
}
