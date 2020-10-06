package com.springboot.tao.controller.spring;

import com.springboot.tao.bean.spring.FactoryBeanTest;
import com.springboot.tao.configer.spring.FactoryBeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taozhiwei
 * @date 2020/7/27 16:12
 */
@RestController
public class FactoryBeanController {

    @Autowired
    @Qualifier("factoryBeanConfig")
    FactoryBeanTest factoryBeanTest;

    @Autowired
    @Qualifier("&factoryBeanConfig")
    FactoryBeanConfig factoryBeanConfig1;

    @RequestMapping("/factory/bean")
    public void beanObject(){
        System.out.println("mm");
    }
}
