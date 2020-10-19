package com.springboot.tao.configer.spring.processor;

/**
 * @author taozhiwei
 * @date 2020/10/10 11:15
 */

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Service;

/**
 * 当所有单例bean都初始化完成后，spring会调用实现了
 * SmartInitializingSingleton接口bean的afterSingletonsInstantiated方法
 * 该方法在所有beanPostProcessor处理完，bean初始化完成时候才会调用
 */
//@Service
public class MySmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("SmartInitializingSingleton");
    }
}
