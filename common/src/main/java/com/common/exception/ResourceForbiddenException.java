package com.common.exception;

import java.net.HttpURLConnection;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 11:54
 */
public class ResourceForbiddenException extends ResourceException{


    public ResourceForbiddenException(int errorCode, String msg, Throwable cause) {
        super(HttpURLConnection.HTTP_FORBIDDEN, msg, cause);
    }

    public ResourceForbiddenException(int errorCode, String msg) {
        super(HttpURLConnection.HTTP_FORBIDDEN, msg);
    }
}
