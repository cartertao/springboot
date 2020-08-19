package com.springboot.tao.configer;

import org.omg.CORBA.PUBLIC_MEMBER;
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
