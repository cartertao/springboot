package com.springboot.tao.configer.spring.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * @author taozhiwei
 * @date 2020/10/14 14:14
 * 需要使用@Value 没有get set也不会报错，此处加上是为了获取值
 */
@Service
@PropertySource(value= {"classpath:test.properties", "classpath:test1.properties"})
@Data
public class MyPropertySource1 {
    @Value("${test.name}")
    public String name;
    @Value("${test.password}")
    public String password;
    @Value("${test.age}")
    public String age;
    @Value("${test.id}")
    public String id;
}
