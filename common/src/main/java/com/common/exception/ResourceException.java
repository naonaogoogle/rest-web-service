package com.common.exception;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-09-05 20:27
 */
public class ResourceException extends RuntimeException{

    private static final long serialVersionUID = 1774726614728506436L;

    /**
     * the Http error code;
     */
    private final int errorCode;


    public ResourceException(final int errorCode, final String msg,final Throwable cause) {
        super(msg,cause);
        this.errorCode = errorCode;
    }

    public ResourceException(final int errorCode,final String msg) {
        super(msg);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
