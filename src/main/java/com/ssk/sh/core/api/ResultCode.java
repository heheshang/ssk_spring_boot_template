package com.ssk.sh.core.api;

/**
 * @author T0220165
 */

public enum ResultCode implements StatusCode {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    UNAUTHORIZED(401, "未认证"),
    NOT_FOUND(404, "未找到"),
    METHOD_NOT_ALLOWED(405, "方法不允许"),
    REQUEST_TIMEOUT(408, "请求超时"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),
    BAD_GATEWAY(502, "网关错误"),
    SERVICE_UNAVAILABLE(503, "服务不可用"),
    NOT_ACCEPTABLE (406, "不可接受"),
    RESPONSE_BACK_ERROR(504, "响应超时"),
    VALIDATE_ERROR(604, "响应超时"),
    PARAM_ERROR(700, "参数校验失败"),
    ;
    private int code;
    private String message;

    ResultCode(int code, String message) {
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
