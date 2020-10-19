package com.springboot.tao.configer.spring.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * @author taozhiwei
 * @date 2020/10/14 15:00
 */
@Service
@PropertySource(value= {"classpath:test.properties"})
@ConfigurationProperties(prefix = "test")
@Data
public class MyPropertySource2 {

    public String name;
    public String password;
    public String age;
    public String id;
}
