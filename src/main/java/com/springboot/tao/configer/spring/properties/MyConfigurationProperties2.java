package com.springboot.tao.configer.spring.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author taozhiwei
 * @date 2020/10/13 17:09
 * 既可以
 */
@Component
@ConfigurationProperties(prefix = "test2.mysql")
public class MyConfigurationProperties2 {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyConfigurationProperties2{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
