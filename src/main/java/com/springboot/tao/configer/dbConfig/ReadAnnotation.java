package com.springboot.tao.configer.dbConfig;

import java.lang.annotation.*;

/**
 * @author taozhiwei
 * @date 2020/10/14 16:08
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ReadAnnotation {
    DbTypeEnum value() default DbTypeEnum.SLAVE;
}
