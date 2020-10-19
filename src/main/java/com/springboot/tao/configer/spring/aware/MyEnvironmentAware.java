package com.springboot.tao.configer.spring.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author taozhiwei
 * @date 2020/10/10 14:51
 */
//@Service
public class MyEnvironmentAware implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        String java_home = environment.getProperty("JAVA_HOME");
        String property = environment.getProperty("spring.name");
        System.out.println("MyEnvironmentAware ------ " + java_home + property);
    }
}
