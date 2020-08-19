package com.springboot.tao.demo.jdk.reflection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author taozhiwei
 * @date 2020/8/12 11:02
 */
public class ReflectionSon extends ReflectionFather<ReflectionBean>{

    public String name;

    public ReflectionSon(String a) {
    }

    public ReflectionSon(){

    }

    public String son(String str, HashMap<String, ArrayList<Integer>> list){
        return str;
    }

    public String method1(Integer a){
        return a.toString();
    }
}
