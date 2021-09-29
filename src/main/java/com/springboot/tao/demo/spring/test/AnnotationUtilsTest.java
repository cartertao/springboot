package com.springboot.tao.demo.spring.test;

import com.springboot.tao.configer.MyAnnotaion.TestAnnotaion;
import com.springboot.tao.demo.AllTest;
import com.springboot.tao.demo.AllTest2;
import org.springframework.context.annotation.Bean;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Author: carter
 * @Date: 2021/9/29
 */
public class AnnotationUtilsTest {

    public static void main(String[] args) throws NoSuchMethodException {

        /**
         * find
         * 获取方法或者类上面注解
         * 1. 可以获取父类的注解，如果子类也有该注解，则返回子注解，如果没有则返回父注解
         * 2. 如果子类没有重写父类方法，则通过子类方clzz.getDeclaredMethod(),会报错没有该方法
         *    如果子类重写了父方法，如果没有注解，则可以获取父注解，如果有注解，则返回子注解
         *    但是AnnotationUtils.findAnnotation(annotatedElement, Bean.class);是无法获取父方法注解的，只能获取子类方法注解
         */
        Class<AllTest2> clzz = AllTest2.class;
        // 如果注解在父类上，也会返回，如果不存在则返回null
        TestAnnotaion annotation1 = AnnotationUtils.findAnnotation(clzz, TestAnnotaion.class);

        // 获取method上注解
        Method test = clzz.getDeclaredMethod("test", null);
        Bean annotation2 = AnnotationUtils.findAnnotation(test, Bean.class);

        // 通过拿到方法参数对象，然后通过该对象拿到方法上注解 AnnotatedElement
        MethodParameter methodParameter = new MethodParameter(test, -1);
        Annotation[] methodAnnotations = methodParameter.getMethodAnnotations();
        AnnotatedElement annotatedElement = methodParameter.getAnnotatedElement();
        Bean annotation3 = AnnotationUtils.findAnnotation(annotatedElement, Bean.class);

        /**
         * get 只能获取子类注解，无法获取父类注解
         *
         */
        // 通过方法参数获取方法上注解
        Bean annotation = AnnotationUtils.getAnnotation(annotatedElement, Bean.class);
        // 通过方法获取方法上注解
        TestAnnotaion annotation4 = AnnotationUtils.getAnnotation(test, TestAnnotaion.class);
        // 判断第一个参数注解是不是指定的class，如果是则返回该注解，否则返回null
        TestAnnotaion annotation5 = AnnotationUtils.getAnnotation(annotation4, TestAnnotaion.class);

        /**
         * getAnnotationAttributes 获取注解里面的参数
         */
        // 获取所有参数， key:参数名 value:参数值
        Map<String, Object> annotationAttributes = AnnotationUtils.getAnnotationAttributes(annotation5);

        // 获取单个变量的注解的默认值
        //AnnotationUtils.getDefaultValue()

        // 获取注解指定变量的默认值
        // AnnotationUtils.getDefaultValue(annotation5, "name")


    }
}
