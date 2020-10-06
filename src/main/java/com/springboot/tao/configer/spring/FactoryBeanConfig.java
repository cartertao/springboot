package com.springboot.tao.configer.spring;

import com.springboot.tao.bean.spring.FactoryBeanTest;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author taozhiwei
 * @date 2020/7/27 16:08
 */
public class FactoryBeanConfig implements FactoryBean<FactoryBeanTest> {

    @Override
    public FactoryBeanTest getObject() throws Exception {
        FactoryBeanTest factoryBeanTest = new FactoryBeanTest();
        factoryBeanTest.setName("factory bean");
        return factoryBeanTest;
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanTest.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
