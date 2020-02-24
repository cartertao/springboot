package com.example.demo.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Xss extends HttpServletRequestWrapper {

    public Xss(HttpServletRequest request) {
        super(request);
    }

    //是获得相应名的数据，如果有重复的名，则返回第一个的值. 接收一般变量，如text类型
    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);    //
        return value;
    }

    //是获得如checkbox类（名字相同，但值有多个）的数据。 接收数组变量，如checkobx类型
    @Override
    public String[] getParameterValues(String name) {
        String[] arr = super.getParameterValues(name);
        return arr;
    }

    //获取请求头
    @Override
    public String getHeader(String name) {
        String value = super.getHeader(name);
        return value;
    }
}
