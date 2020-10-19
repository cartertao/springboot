package com.springboot.tao.configer.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @author taozhiwei
 * @date 2020/7/1 17:45
 * 拦截所有bean
 */
//@Service
public class MyBeanPostPorcessor implements BeanPostProcessor {

    public MyBeanPostPorcessor(){
        System.out.println("BeanPostPorcessor new object");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("BeanPostPorcessor BeforeInitialization  " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("BeanPostPorcessor postProcessAfterInitialization  " + beanName);
        return bean;
    }
}
