package com.ssk.sh.core.anno.validate;

import com.ssk.sh.core.enums.DemoStatus;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

//@Component
public class DemoStatusValidator implements ConstraintValidator<DemoStatusValidate, DemoStatus> {

    private DemoStatus[] allowedValues;

    @Override
    public void initialize(DemoStatusValidate constraintAnnotation) {

        this.allowedValues = constraintAnnotation.allowedValues();
    }

    @Override
    public boolean isValid(DemoStatus value, ConstraintValidatorContext context) {
        if (value == null) {
            return false; // 不允许 null
        }
        for (DemoStatus allowed : allowedValues) {
            if (value.equals(allowed)) {
                return true;
            }
        }
        return false;
    }
}
