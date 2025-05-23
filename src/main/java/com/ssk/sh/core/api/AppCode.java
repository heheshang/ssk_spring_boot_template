package com.ssk.sh.core.api;

/**
 * @author T0220165
 */

public enum AppCode implements StatusCode {

    APP_ERROR(2000, "业务异常");


    private int code;
    private String message;

    AppCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
