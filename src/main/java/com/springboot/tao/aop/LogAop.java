package com.springboot.tao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author taozhiwei
 * @date 2020/7/27 14:01
 */
@Aspect
@Component
public class LogAop {

    @Pointcut("execution(* com.springboot.tao.controller.*.*(..))")
    public void puct(){};

/*    @Pointcut("execution(* com.springboot.controller.StudentController.*(..))")
    public void puct1(){};

    @Before("puct() || puct1()")
    public void before(){

    }*/

    @Before("puct()")
    public void before(JoinPoint joinPoint){
        //这个RequestContextHolder是Springmvc提供来获得请求的东西
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();

        // 记录下请求内容
        System.out.println("################URL : " + request.getRequestURL().toString());
        System.out.println("################HTTP_METHOD : " + request.getMethod());
        System.out.println("################IP : " + request.getRemoteAddr());
        System.out.println("################THE ARGS OF THE CONTROLLER : " + Arrays.toString(joinPoint.getArgs()));

        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
        System.out.println("################CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        Object target = joinPoint.getTarget();
        Object aThis = joinPoint.getThis();

        //logger.info("################TARGET: " + joinPoint.getTarget());//返回的是需要加强的目标类的对象
        //logger.info("################THIS: " + joinPoint.getThis());//返回的是经过加强后的代理类的对象
    }

    @AfterThrowing(pointcut = "puct()", throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println("------------afterThrowing start-------");
        e.printStackTrace();
        System.out.println("------------afterThrowing end-------");
    }

    @AfterReturning(pointcut = "puct()", returning = "obj")
    public void before(Object obj){

    }

    @Around("puct()")
    public Object around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("------------around start-------");
        Object proceed = point.proceed();
        System.out.println("------------around end-------");
        return proceed;
    }
}
