package com.example.demo.config;

import com.example.demo.bean.FactoryBeanTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //@Bean
    public FactoryBeanTest factoryBeanTest(){
        return new FactoryBeanTest();
    }
}
