package com.ssk.sh.core.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author T0220165
 */
@Target({
        ElementType.METHOD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotControllerResponseAdvice {

}
