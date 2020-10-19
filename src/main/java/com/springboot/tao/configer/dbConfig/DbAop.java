package com.springboot.tao.configer.dbConfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author taozhiwei
 * @date 2020/10/14 17:13
 */
@Aspect
@Component
public class DbAop {

    @Pointcut("execution(* com.springboot.tao.services.impl..*.*(..))")
    public void dataSourcePointcut(){};

    /**
     * 拦截方法上的注解
     */
    @Around("dataSourcePointcut()")
    public Object doAround(ProceedingJoinPoint pjp) {
        //获取方法上的注解
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        WriteAnnotation typeAnno = method.getAnnotation(WriteAnnotation.class);

        //如果注解为空会走默认的slave
        if(typeAnno != null){
            DbTypeEnum sourceEnum = typeAnno.value();
            //线程保存数据源类型
            DynamicSwitchDBTypeUtil.setDbType(sourceEnum);
        }

        Object result = null;
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            DynamicSwitchDBTypeUtil.setDbType(DbTypeEnum.SLAVE);
        }
        return result;
    }
}
