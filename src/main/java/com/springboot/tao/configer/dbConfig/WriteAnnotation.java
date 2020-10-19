package com.springboot.tao.configer.dbConfig;

import java.lang.annotation.*;

/**
 * @author taozhiwei
 * @date 2020/10/14 16:07
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WriteAnnotation {
    DbTypeEnum value() default DbTypeEnum.MASTER;
}
