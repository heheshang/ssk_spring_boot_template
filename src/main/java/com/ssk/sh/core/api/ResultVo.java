package com.ssk.sh.core.api;

import lombok.Getter;

/**
 * @author T0220165
 */
@Getter
public class ResultVo {

    private int code;
    private String message;
    private Object data;

    public ResultVo(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultVo(Object data) {
        this.code = ResultCode.SUCCESS.getCode();
        this.message = ResultCode.SUCCESS.getMessage();
        this.data = data;
    }

    public ResultVo(StatusCode statusCode, Object data) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
        this.data = data;
    }
    public ResultVo(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
        this.data = null;
    }
}
