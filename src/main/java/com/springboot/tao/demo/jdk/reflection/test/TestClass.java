package com.springboot.tao.demo.jdk.reflection.test;

import com.springboot.tao.demo.jdk.reflection.ReflectionSon;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.*;
import java.net.URL;

/**
 * @author taozhiwei
 * @date 2020/8/12 10:58
 */
public class TestClass {

    public static void main(String[] args) throws Exception {
        Class<ReflectionSon> reflectionSonClass = ReflectionSon.class;
        //获取 属性，方法，构造函数
        //declare 获取所有包含私有的     需要参数的是指定类型
        reflectionSonClass.getDeclaredConstructor();
        reflectionSonClass.getConstructors();
        reflectionSonClass.getConstructor(String.class);
        reflectionSonClass.getDeclaredConstructor(String.class);

        Field[] declaredFields = reflectionSonClass.getDeclaredFields();
        Field[] fields = reflectionSonClass.getFields();
        Field name = reflectionSonClass.getField("name");
        reflectionSonClass.getField("name");

        reflectionSonClass.getMethods();
        reflectionSonClass.getDeclaredMethods();
        reflectionSonClass.getMethod("method1", Integer.class);
        reflectionSonClass.getDeclaredMethod("method1", Integer.class);

        //以 / 开头，获取classes路径，否则获取该类在classes中的目录
        //  /E:/work/study/springboot1/target/classes/com/springboot/tao/jdk/reflection/
        //  /E:/work/study/springboot1/target/classes/
        URL resource = reflectionSonClass.getResource("");
        URL resource1 = reflectionSonClass.getResource("/");

        reflectionSonClass.getAnnotations();
        reflectionSonClass.getDeclaredAnnotation(Bean.class);
        reflectionSonClass.getDeclaredAnnotations();
        reflectionSonClass.getDeclaredAnnotation(Bean.class);
        //返回该class类的父类，以注解类表示该父类，并不是得到父类的注解
        //如果T1是Object类，接口类型，数组类型，基元类型或void，则返回值为null
        AnnotatedType annotatedSuperclass = reflectionSonClass.getAnnotatedSuperclass();
        //返回该class类的接口，以注解类表示该接口（可以实现多个接口所以数组），并不是得到父类的注解
        AnnotatedType[] annotatedInterfaces = reflectionSonClass.getAnnotatedInterfaces();

        //泛型
        //返回继承的父类的类型，并包含父类的泛型，如果父类又继承了其他类，不会返回其他类，只会返回上一层父类
        //如果没有继承则返回顶级父类Object类
        Type type = reflectionSonClass.getGenericSuperclass();
        //接口泛型Type
        Type[] genericInterfaces = reflectionSonClass.getGenericInterfaces();
        //获取Type的泛型
        ParameterizedType genericSuperclass= (ParameterizedType)type;
        //得到父类或者实现类的class
        Type rawType = genericSuperclass.getRawType();
        //获取Type的泛型
        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();

        //获取父类、接口
        Class<? super ReflectionSon> superclass = reflectionSonClass.getSuperclass();
        reflectionSonClass.getInterfaces();
    }
}
