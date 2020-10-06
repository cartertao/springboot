package com.springboot.tao.configer.shiro;

import com.springboot.tao.bean.ShiroReaml;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.redisson.api.RedissonClient;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

/**
 * @author taozhiwei
 * @date 2020/9/1 16:37
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroReaml shiroReaml(){
        return new ShiroReaml();
    }

    /**
     * sessionDao session增删改查
     */
    @Bean
    public SessionDAO sessionDao(RedissonClient redissonClient){
        return new MySessionDao(redissonClient);
    }

    @Bean
    public SessionManager SessionManager(SessionDAO sessionDao){
        DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
        //SimpleCookie simpleCookie = new SimpleCookie(ShiroHttpSession.DEFAULT_SESSION_ID_NAME);
        SimpleCookie simpleCookie = new SimpleCookie("sid");
        simpleCookie.setHttpOnly(true);
        simpleCookie.setSecure(false);
        simpleCookie.setMaxAge(10 * 60);//设置客户端session cookie过期秒
        defaultWebSessionManager.setSessionIdCookie(simpleCookie);
        defaultWebSessionManager.setGlobalSessionTimeout(5 * 60 * 1000);//设置服务端session过期时间
        defaultWebSessionManager.setSessionDAO(sessionDao);
        return defaultWebSessionManager;
    }

    /**
     * 设置cookie rememberMe 过期时间秒
     */
    @Bean
    public CookieRememberMeManager cookieRememberMeManager(){
        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
        SimpleCookie simpleCookie = new SimpleCookie(CookieRememberMeManager.DEFAULT_REMEMBER_ME_COOKIE_NAME);
        simpleCookie.setHttpOnly(true);
        simpleCookie.setMaxAge(60 * 60 * 4);
        cookieRememberMeManager.setCookie(simpleCookie);
        return cookieRememberMeManager;
    }

    @Bean("securityManager")
    public SecurityManager securityManager(ShiroReaml shiroReaml, CookieRememberMeManager cookieRememberMeManager, SessionManager SessionManager){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(shiroReaml);
        defaultWebSecurityManager.setSessionManager(SessionManager);
        defaultWebSecurityManager.setRememberMeManager(cookieRememberMeManager);
        return defaultWebSecurityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean factory = new ShiroFilterFactoryBean();
        factory.setSecurityManager(securityManager);
        factory.setLoginUrl("/login.html");
        factory.setSuccessUrl("/success.html");
        //没有权限
        factory.setUnauthorizedUrl("/shiro/unAuthorized");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        //拦截器是  拦截器名[参数]  默认拦截器有 roles perms
        //不需要登录匿名访问
        map.put("/shiro/login", "anon");
        //需要角色
        map.put("/shiro/admin", "roles[admin]");
        //需要权限
        //map.put("/shiro/select", "perms[user:select]");
        map.put("/shiro/select", "anon");
        //需要登录
        //map.put("/**", "authc");
        factory.setFilterChainDefinitionMap(map);
        return factory;
    }

    /**
     *  以下2个bean是开启shiro的注解@RequiresRoles,@RequiresPermissions)
     *  shiro注解模式下，登录失败或者是没有权限都是抛出异常，并且默认的没有对异常做处理，
     *  因此解决方法要么就使用配置文件perms，roles，ssl，rest，port，或者是按照springmvc的处理方式，专门配置一个异常处理
     */
    @Bean
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
