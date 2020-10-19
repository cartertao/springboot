package com.springboot.tao.configer.spring.processor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @author taozhiwei
 * @date 2020/10/10 15:07
 */
//@Service
public class MyInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }
}
