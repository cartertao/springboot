package com.springboot.tao.configer.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author taozhiwei
 * @date 2020/10/10 14:12
 * 获取 AnnotationConfigServletWebServerApplicationContext  -- createApplicationContext
 */
//@Service
public class MyApplicationContextAware implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyApplicationContextAware -----" + applicationContext);
        Object taoConfig = applicationContext.getBean("SessionManager");
        this.context = applicationContext;
    }
}
