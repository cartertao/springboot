package com.springboot.tao.demo;

import com.springboot.tao.configer.MyAnnotaion.TestAnnotaion;
import org.springframework.core.annotation.AnnotatedElementUtils;

/**
 * @author taozhiwei
 * @date 2020/8/14 13:23
 */
@TestAnnotaion
public class AllTest {

    public static void main(String[] args) {
        boolean b = AnnotatedElementUtils.hasAnnotation(AllTest.class, TestAnnotaion.class);
        System.out.println(b);
    }

    @TestAnnotaion
    public void test(){

    }
}
