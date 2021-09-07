package com.springboot.tao.configer.valid;

import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @Author: carter
 * @Date: 2021/9/7
 */
@Target({METHOD, FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyValid {
    /**
     * @desc 枚举类型
     * @return
     */
    Class value();

    String message() default "参数可选值错误";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
