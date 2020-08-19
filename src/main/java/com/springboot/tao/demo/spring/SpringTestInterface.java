package com.springboot.tao.demo.spring;

import com.springboot.tao.configer.MybatisConfig;

import java.util.ArrayList;

/**
 * @author taozhiwei
 * @date 2020/8/12 16:20
 */
public interface SpringTestInterface <T extends MybatisConfig>{
    String getInterface(String str, ArrayList<Long> list);
}
