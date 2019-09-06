package com.common.exception;

import java.net.HttpURLConnection;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-06 12:53
 */
public class ResourcePreconditionException extends ResourceException{

    public ResourcePreconditionException(String msg, Throwable cause) {
        super(HttpURLConnection.HTTP_PRECON_FAILED, msg, cause);
    }

    public ResourcePreconditionException(String msg) {
        super(HttpURLConnection.HTTP_PRECON_FAILED, msg);
    }
}
