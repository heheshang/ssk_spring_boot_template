package com.ssk.sh.core.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * @author T0220165
 */
@Getter
public enum DemoStatus {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    DemoStatus(long code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     *  获取枚举
     *   API 调用时，需要将枚举值作为字符串传递给后端，后端可以通过 @JsonCreator 注解来实现枚举值的反序列化。
     *   例如，在 API 调用时，传递的枚举值为 "SUCCESS"，后端可以通过以下方式来获取枚举值：
     *   DemoStatus status = DemoStatus.fromValue("SUCCESS");
     * @param value
     * @return
     */
    @JsonCreator
    public static DemoStatus fromValue(String value) {
        for (DemoStatus status : DemoStatus.values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid DemoStatus value: " + value);
    }

    /**
     *  API 调用时，需要将枚举值作为字符串传递给前端，前端可以通过 @JsonValue 注解来实现枚举值的序列化。
     *  例如，在 API 调用时，返回的枚举值为 "SUCCESS"，前端可以通过以下方式来获取枚举值：
     *  String status = DemoStatus.SUCCESS.getName();
     * @return
     */
    @JsonValue
    public String getName() {
        return this.name().toLowerCase();
    }
}
