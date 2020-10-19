package com.springboot.tao.configer.spring;

import com.springboot.tao.bean.spring.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author taozhiwei
 * @date 2020/9/1 10:56
 */
//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    /**
     * 拦截器配置
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/interceptor/**")
                .excludePathPatterns("/static/**", "/interceptor/test2");
    }

    /**
     * 页面跳转 http://localhost:8080/login.html   或者login.jsp
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/interceptor/html1").setViewName("login");
    }

    /**
     * 静态资源
     */
/*    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
    }*/

    /**
     * 视图解析器
     */
/*    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        //请求视图文件的前缀地址
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        //请求视图文件的后缀
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setSuffix(".html");
        registry.viewResolver(internalResourceViewResolver);
    }*/

    /**
     * 跨域
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/cors/**")
                .allowedHeaders("*")
                .allowedMethods("POST","GET")
                .allowedOrigins("*");
    }

    /**
     * 消息内容转换配置, 注意由于springMvc auto config里面已经有一些转换类，只要一个类匹配成功则后面不继续匹配，而我们加入的一般在最后面
     */
/*    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //调用父类的配置
        //创建fastJson消息转换器
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //创建配置类
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //修改配置返回内容的过滤
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty
        );
        fastConverter.setFastJsonConfig(fastJsonConfig);
        //将fastjson添加到视图消息转换器列表内
        converters.add(fastConverter);
    }*/

}
