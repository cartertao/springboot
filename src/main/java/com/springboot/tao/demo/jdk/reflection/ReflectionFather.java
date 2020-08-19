package com.springboot.tao.demo.jdk.reflection;

import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author taozhiwei
 * @date 2020/8/12 11:02
 */
@Configuration
public class ReflectionFather<T extends ReflectionBean> {

    public String father(String str, HashMap<String, ArrayList<Integer>> list){
        return str;
    }
}
