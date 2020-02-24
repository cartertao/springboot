package com.example.demo.config;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter(filterName = "myfilter",urlPatterns = "/*")
class Myfilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletRequest rq =new Xss((HttpServletRequest)request);
        if(rq.getParameter("url").equals("a")){
            chain.doFilter(rq,response);    //走自己定义的
        }else if (rq.getParameter("url").equals("b")){
            chain.doFilter(request,response);   //走默认的
        }else if (rq.getParameter("url").equals("c")){
            HttpServletResponse rs = (HttpServletResponse) response;
            request.getRequestDispatcher("/t3?a=t3").forward(request,response);//服务器请求自己另一个接口
        }else {
            HttpServletResponse rs = (HttpServletResponse) response;
            rs.sendRedirect("/t2?a=t2");//服务器给个url浏览器，浏览器在请求服务器,浏览器请求一次浏览器一共请求2次
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
