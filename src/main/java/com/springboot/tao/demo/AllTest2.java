package com.springboot.tao.demo;

import com.springboot.tao.configer.MyAnnotaion.TestAnnotaion;
import com.springboot.tao.demo.AllTest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @Author: carter
 * @Date: 2021/9/29
 */

public class AllTest2 extends AllTest {

    @TestAnnotaion(age = "zhi")
    @Override
    public void test() {
        super.test();
    }
}
