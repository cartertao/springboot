package com.springboot.tao.configer.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author taozhiwei
 * @date 2020/7/1 16:53
 * BeanFactoryPostProcessor 接口是 Spring 初始化 BeanFactory 时对外暴露的扩展点，
 * Spring IoC 容器允许 BeanFactoryPostProcessor 在容器实例化任何 bean 之前读取 bean 的定义，并可以修改它
 *
 * BeanDefinitionRegistryPostProcessor 继承自 BeanFactoryPostProcessor，比 BeanFactoryPostProcessor 具有更高的优先级，
 * 主要用来在常规的 BeanFactoryPostProcessor 检测开始之前注册其他 bean 定义。特别是，你可以通过 BeanDefinitionRegistryPostProcessor
 * 来注册一些常规的 BeanFactoryPostProcessor，因为此时所有常规的 BeanFactoryPostProcessor 都还没开始被处理
 */
//@Service
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(s->{
            if(s.equals("springMvc")) {
                System.out.println(s);
            }
        });
    }
}
