package com.springboot.tao.demo.spring.test;

import com.springboot.tao.demo.spring.SpringTestSon;
import org.springframework.core.MethodParameter;
import org.springframework.core.ResolvableType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author taozhiwei
 * @date 2020/8/12 16:09
 */
public class ResolvableTypeTest {

    public static void main(String[] args) throws Exception {
        Class<SpringTestSon> clazz = SpringTestSon.class;
        Constructor<SpringTestSon> constructor = clazz.getConstructor(String.class, int.class);
        Field field = clazz.getDeclaredField("map");
        Method method = clazz.getDeclaredMethod("getInterface", String.class, ArrayList.class);
        Method testMethod = clazz.getDeclaredMethod("testMethod");

        //通过构造函数获取构造函数指定索引位置参数的 resolvableType
        ResolvableType resolvableType = ResolvableType.forConstructorParameter(constructor, 1);

        //获取指定file的ResolvableType 可以指定层级
        //HashMap<Integer, ArrayList<String>> 第一层是hashMap  第二层是 Integer和ArrayList,会拿每层的最后一个
        ResolvableType r = ResolvableType.forField(field);
        ResolvableType resolvableType4 = ResolvableType.forField(field, 2);

        //获取指定方法的指定索引参数和方法返回值的 ResolvableType,如果没有返回值则Void.class
        ResolvableType resolvableType2 = ResolvableType.forMethodParameter(method, 0);
        MethodParameter methodParameter = new MethodParameter(method, 1);
        ResolvableType.forMethodParameter(methodParameter);
        ResolvableType resolvableType3 = ResolvableType.forMethodReturnType(method);
        ResolvableType resolvableType5 = ResolvableType.forMethodReturnType(testMethod);

        //获取ResolvableType 的父类
        r.getSuperType();
        //判断该类型是否是map类型，不是则resolvableType.resolve()为null
        r.asMap();
        //判断是否是集合类型,是则返回 Collection类型(ArrayList也返回Collection)，不是则resolvableType.resolve()为null
        r.asCollection();
        //判断是否是指定类型，不是则为null   如果是则resolvableType.resolve()为ArrayList.class
        ResolvableType as = r.as(ArrayList.class);

        //获取该类型的所有泛型的ResolvableType
        ResolvableType[] generics = r.getGenerics();
        //获取该类型指定索引泛型map<T,V>
        ResolvableType generic = r.getGeneric(0);
        ResolvableType generic1 = r.getGeneric(1);
        //获取该类型的泛型的class
        Class<?>[] classes = r.resolveGenerics();
        Class<?> aClass = r.resolveGeneric(0);
        Class<?> aClass1 = r.resolveGeneric(1);
        //如果泛型为null则返回指定泛型
        Class<?>[] classes1 = r.resolveGenerics(Integer.class);

        //返回实现的所有接口
        ResolvableType[] interfaces = r.getInterfaces();

        //HashMap<Integer, ArrayList<String>>
        //第一层 HashMap<Integer, ArrayList<String>>
        ResolvableType nested = r.getNested(1);
        //ArrayList<String> 查找没层的最后一个，ArrayList<String>在Integer后面
        ResolvableType nested1 = r.getNested(2);
        //String
        ResolvableType nested2 = r.getNested(3);
        //key：层数 value:第几个
        HashMap<Integer,Integer> map = new HashMap<>(3);
        map.put(1,1);	//第一层第一个
        map.put(2,1);	//第二层第一个
        ResolvableType nested3 = r.getNested(2, map);

        //如果resolvableType来自构造函数或者方法则为 MethodParameter,如果parameterIndex为-1则为返回值
        //如果来自Field则为Field
        Object source = resolvableType3.getSource();
        if(source instanceof MethodParameter){
            MethodParameter mp = (MethodParameter)source;
            int parameterIndex = mp.getParameterIndex();
        }else if(source instanceof Field){

        }
    }
}
