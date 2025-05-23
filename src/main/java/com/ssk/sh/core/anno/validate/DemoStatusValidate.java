package com.ssk.sh.core.anno.validate;

import com.ssk.sh.core.enums.DemoStatus;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {DemoStatusValidator.class}
)
public @interface DemoStatusValidate {
    String message() default "无效的枚举值";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    DemoStatus[] allowedValues(); // 支持多个合法值
}
