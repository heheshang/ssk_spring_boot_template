package com.ssk.sh.core.exception;

import com.ssk.sh.core.api.ResultCode;
import com.ssk.sh.core.api.ResultVo;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author T0220165
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResultVo handleHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException e) {
        return new ResultVo(ResultCode.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(BindException.class)
    public ResultVo handleHttpMediaTypeNotAcceptableException(BindException e) {
        ObjectError error = e.getBindingResult().getAllErrors().get(0);
        return new ResultVo(ResultCode.PARAM_ERROR, error.getDefaultMessage());
    }


    @ExceptionHandler(ApiException.class)
    public ResultVo handleApiException(ApiException e) {
        return new ResultVo(e.getCode(), e.getMsg(), e.getMessage());
    }
}
