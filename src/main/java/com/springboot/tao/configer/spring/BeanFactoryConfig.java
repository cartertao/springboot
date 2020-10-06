package com.springboot.tao.configer.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author taozhiwei
 * @date 2020/7/27 16:26
 */
@Configuration
public class BeanFactoryConfig {

    @Bean
    public FactoryBeanConfig factoryBeanConfig(){
        return new FactoryBeanConfig();
    }
}
