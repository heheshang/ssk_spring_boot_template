package com.ssk.sh.core.exception;

import com.ssk.sh.core.api.AppCode;
import com.ssk.sh.core.api.ResultCode;
import lombok.Getter;

/**
 * @author T0220165
 */
@Getter
public class ApiException extends RuntimeException {

    private int code;
    private String msg;


    public ApiException(ResultCode resultCode, String message) {
        super(message);
        this.code = resultCode.getCode();
        this.msg = message;
    }

    public ApiException(String message) {
        super(message);
        this.code = AppCode.APP_ERROR.getCode();
        this.msg = AppCode.APP_ERROR.getMessage();
    }
}
