package com.springboot.tao.test;

import lombok.Getter;

import java.util.ArrayList;

/**
 * @Author: carter
 * @Date: 2021/8/12
 */
public class Test {
    public static void main(String[] args) {
//        Class<TestEnum> testEnumClass = TestEnum.class;
//        TestEnum[] enumConstants = testEnumClass.getEnumConstants();
//        for (TestEnum enumConstant : enumConstants) {
//            System.out.println(enumConstant.getValue());
//        }
        Test[] enumConstants1 = Test.class.getEnumConstants();

    }
}
