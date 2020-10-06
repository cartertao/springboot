package com.springboot.tao.configer.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author taozhiwei
 * @date 2020/8/13 13:47
 */
//@WebFilter(urlPatterns = "/*", filterName = "myFilter")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("-------myFilter start----------");
        chain.doFilter(request,response);
        System.out.println("-------myFilter end----------");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-------myFilter init----------");
    }

    @Override
    public void destroy() {
        System.out.println("-------myFilter destroy----------");
    }
}
