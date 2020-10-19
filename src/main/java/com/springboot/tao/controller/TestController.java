package com.springboot.tao.controller;

import com.springboot.tao.configer.spring.properties.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taozhiwei
 * @date 2020/10/14 14:18
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    public MyConfigurationProperties1 myConfigurationProperties1;
    @Autowired
    public ConfigBean configBean;
    @Autowired
    public MyConfigurationProperties2 myConfigurationProperties2;
    @Autowired
    public MyPropertySource1 myPropertySource1;
    @Autowired
    public MyPropertySource2 myPropertySource2;
    @RequestMapping("/test1")
    public void test(){
        System.out.println(myConfigurationProperties1);  //cglib
        System.out.println(configBean);
        System.out.println(myConfigurationProperties2);
        System.out.println(myPropertySource1);
        System.out.println(myPropertySource2);
    }
}
