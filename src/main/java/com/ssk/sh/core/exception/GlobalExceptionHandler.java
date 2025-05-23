package com.ssk.sh.core.exception;

import com.ssk.sh.core.api.ResultCode;
import com.ssk.sh.core.api.ResultVo;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author T0220165
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public ResultVo<String> handleHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException e) {
        return new ResultVo<>(ResultCode.NOT_ACCEPTABLE);
    }
}
