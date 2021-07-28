package com.springboot.tao.demo.spring.test;

import com.springboot.tao.demo.spring.SpringTestSon;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.MethodParameter;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;

/**
 * @author taozhiwei
 * @date 2020/8/12 17:04
 */
public class MethodParameterTest {

    public static void main(String[] args) throws Exception {
        Class<SpringTestSon> clazz = SpringTestSon.class;
        Constructor<SpringTestSon> constructor = clazz.getConstructor(String.class, int.class);
        Method method = clazz.getDeclaredMethod("getInterface", String.class, ArrayList.class);
        Method testMethod = clazz.getDeclaredMethod("testMethod");
        //MethodParameter是把方法的所有参数和返回值都进行了保存，只是有个索引来确定是哪个参数，
        MethodParameter methodParameter = new MethodParameter(method, 1);
        //获取参数索引 -1为返回值
        int parameterIndex = methodParameter.getParameterIndex();
        //获取参数
        Parameter parameter = methodParameter.getParameter();
        //获取参数名称
        String name = parameter.getName();

        //如果不是构造函数返回null
        Constructor<?> constructor1 = methodParameter.getConstructor();
        //得到该方法的类class
        Class<?> declaringClass = methodParameter.getDeclaringClass();
        //Method或者Constructor
        Executable executable = methodParameter.getExecutable();
        //返回泛型类型的方法/构造函数的参数 即使该参数没有泛型
        //如果该类型有泛型则通过(ParameterizedType)type.getActualTypeArguments()拿到泛型 返回值是Type[]
        Type genericParameterType = methodParameter.getGenericParameterType();
        //获取方法或构造上的注解，需要是运行时的注解
        Annotation[] methodAnnotations = methodParameter.getMethodAnnotations();
        AnnotatedElement annotatedElement = methodParameter.getAnnotatedElement();

        //获取参数上的注解，NotNull注解捕捉不到，因为不是运行时的注解
        Param parameterAnnotation = methodParameter.getParameterAnnotation(Param.class);
        Annotation[] parameterAnnotations = methodParameter.getParameterAnnotations();

        String parameterName = methodParameter.getParameterName();

        //methodParameter.initParameterNameDiscovery();
        Class<?> parameterType = methodParameter.getParameterType();
        Type nestedGenericParameterType = methodParameter.getNestedGenericParameterType();
        Class<?> nestedParameterType = methodParameter.getNestedParameterType();



        MethodParameter methodParameter1 = new MethodParameter(method, 1, 2);
        MethodParameter methodParameter2 = new MethodParameter(constructor, 1);
        MethodParameter methodParameter3 = new MethodParameter(constructor, 0, 1);
        System.out.println(1);

    }
}
