package com.springboot.tao.demo;

import com.springboot.tao.configer.MyAnnotaion.TestAnnotaion;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/8/14 13:23
 *
 * 1.非final变量在构造函数中初始化会出现指令重排，可能赋值操作在构造函数执行完后再赋值
 * 2.obj = new AllTest ();可以先初始化构造函数，然后在赋值引用，最后赋值非final变量，这样会导致其他现在拿到该对象时候没有初始化非final变量
 *
 * 3.初次读对象引用与初次读该对象包含的final域，这两个操作之间存在间接依赖关系。由于 编译器遵守间接依赖关系，因此编译器不会重排序这两个操作
 */
@TestAnnotaion
public class AllTest {

    public static void main(String[] args) {
        String[] str = {"a", "b", "c"};
        List<String> strings = Arrays.asList(str);
       strings.forEach(s ->{});

    }

    @Bean(name = "dd")
    public void test() {

    }
}



