package com.springboot.tao.demo.spring;

import com.springboot.tao.configer.MybatisConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author taozhiwei
 * @date 2020/8/12 16:21
 */
public class SpringTestSon extends SpringTestFather<SpringTestBean> implements SpringTestInterface<MybatisConfig> {

    private String name;
    private int age;
    private HashMap<ArrayList<String> ,Integer> map;
    private ArrayList<String> list;

    public SpringTestSon(String name) {
        this.name = name;
    }

    public SpringTestSon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    @Bean("aaa")
    public String getInterface(String str, @Param("aa") ArrayList<Long> list) {
        return str;
    }

    public void testMethod(){

    }
}
