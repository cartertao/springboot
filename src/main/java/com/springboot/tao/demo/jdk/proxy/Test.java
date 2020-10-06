package com.springboot.tao.demo.jdk.proxy;

import java.lang.reflect.Proxy;

/**
 * @author taozhiwei
 * @date 2020/9/14 10:56
 */
public class Test {

    public static void main(String[] args) {
        //代理接口，该接口没有实现类
        //我们在 InterfaceImplementProxy实现方法的返回值就是代理后返回的值
        Class<InterfaceTest> clazz = InterfaceTest.class;
        InterfaceImplementProxy invocation = new InterfaceImplementProxy();
        InterfaceTest proxyObject = (InterfaceTest) Proxy.newProxyInstance(clazz.getClassLoader(),new Class[] {clazz}, invocation);
        String tao = proxyObject.sale("tao", 5);
        System.out.println("得到结果" + tao);

        //如果我们想代理一个接口但是他有实现类，我们想在执行该类的这个方法前后处理一些东西类似AOP
        //我们可以在new代理类时候把该实现类的对象保存进去
        //在代理类的invoke方法中我们可以通过反射Method类的method.invoke(this, args)拿到返回值
        /*Implement imp = new Implement();
        InterfaceImplementProxy invocation = new InterfaceImplementProxy(imp);

        return method.invoke(this, args);*/
    }
}
