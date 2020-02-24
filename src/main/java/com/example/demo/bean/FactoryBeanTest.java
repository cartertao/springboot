package com.example.demo.bean;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanTest implements FactoryBean<TestBean> {
    @Override
    public TestBean getObject() throws Exception {
        TestBean testBean = new TestBean();
        testBean.setSeq("10");
        return testBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestBean.class;
    }
}
