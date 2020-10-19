package com.springboot.tao.configer.spring.aware;

import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

/**
 * @author taozhiwei
 * @date 2020/10/10 10:42
 */
//@Service
public class MyContextAndConfigAwareBean implements ServletContextAware, ServletConfigAware {
    @Override
    public void setServletConfig(ServletConfig servletConfig) {
        System.out.println(servletConfig);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        System.out.println(servletContext);
    }
}
