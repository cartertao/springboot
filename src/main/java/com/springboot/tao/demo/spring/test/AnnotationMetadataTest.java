package com.springboot.tao.demo.spring.test;

import com.springboot.tao.controller.TestController;
import com.springboot.tao.demo.AllTest;
import com.springboot.tao.demo.AllTest2;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Set;

/**
 * @Author: carter
 * @Date: 2021/9/29
 */
public class AnnotationMetadataTest {

    public static void main(String[] args) {
        //AnnotatedElementUtils.get
        AnnotationMetadata introspect = AnnotationMetadata.introspect(AllTest2.class);
        // 判断该类上面是否存在该注解，方法上的不判断
        boolean annotated = introspect.isAnnotated("com.springboot.tao.configer.MyAnnotaion.TestAnnotaion");

        // 返回所有的标注有指定注解的 方法 元数据
        Set<MethodMetadata> annotatedMethods = introspect.getAnnotatedMethods("com.springboot.tao.configer.MyAnnotaion.TestAnnotaion");

        //获取当前类上所有的注解的全类名
        Set<String> annotationTypes = introspect.getAnnotationTypes();

        // 获取当前类注解，以及该注解包含的注解
        Set<String> metaAnnotationTypes = introspect.getMetaAnnotationTypes("com.springboot.tao.configer.MyAnnotaion.TestAnnotaion");
        // 取得指定类型注解的所有变量和变量对应的值  getAnnotationAttributes
        MultiValueMap<String, Object> allAnnotationAttributes = introspect.getAllAnnotationAttributes("com.springboot.tao.configer.MyAnnotaion.TestAnnotaion");

        MergedAnnotations annotations = introspect.getAnnotations();

        // 类中只要有方法标注有指定注解，就返回true
        boolean bean = introspect.hasAnnotatedMethods("com.springboot.tao.configer.MyAnnotaion.TestAnnotaion");

        // 返回所有的标注有指定注解的 方法 元数据
        Set<MethodMetadata> annotatedMethods1 = introspect.getAnnotatedMethods("com.springboot.tao.configer.MyAnnotaion.TestAnnotaion");

    }
}


