package com.springboot.tao.controller.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taozhiwei
 * @date 2020/9/1 11:08
 */
@RestController
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("controller代码执行");
       return "success1";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "success2";
    }
}
