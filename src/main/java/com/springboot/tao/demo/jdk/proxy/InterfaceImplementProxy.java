package com.springboot.tao.demo.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author taozhiwei
 * @date 2020/9/14 10:52
 */
public class InterfaceImplementProxy implements InvocationHandler {

    /**
     * @param proxy     com.springboot.tao.demo.jdk.proxy.InterfaceImplementProxy@337d0578
     * @param method    public abstract java.lang.String com.springboot.tao.demo.jdk.proxy.InterfaceTest.sale(java.lang.String,int)
     * @param args      [tao, 5]
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //一般DEBUG时，我们查看变量时，会调用其toString()方法，由于该方法也会被代理，所以出现递归调用，
        //这里为了避免DEBUG时，重复调用方法，所以作特殊处理
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        }
        System.out.println("调用前");
        //这里是为接口的方法构造实现逻辑，
        // 由于我们已经获取到了方法名称和参数值，所以可以根据实际需要去创建实现逻辑。
        Object result = "方法名称:" + method.getName() + ",参数值:" + Arrays.toString(args) + ",clazz:" + proxy.getClass();
        System.out.println("调用后result:" + result);
        return result;
    }
}
