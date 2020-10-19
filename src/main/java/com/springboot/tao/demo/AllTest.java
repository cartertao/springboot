package com.springboot.tao.demo;

import com.springboot.tao.configer.MyAnnotaion.TestAnnotaion;
import com.springboot.tao.configer.dbConfig.WriteAnnotation;
import com.sun.istack.internal.NotNull;
import org.elasticsearch.search.aggregations.metrics.ParsedSingleValueNumericMetricsAggregation;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.AnnotatedElementUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author taozhiwei
 * @date 2020/8/14 13:23
 */
@TestAnnotaion
public class AllTest{

    public static void main(String[] args) {
        System.out.println(go(2));
    }

    public static int go(int x){
        double d = 100;
        long a = 22;
        Long b = 333L;
        int j=0;
        switch (3) {
            case 1:j++;
            default:j++;
            case 2:j++;
        }
        //2
        return j;
    }
}

class Father{
    private String name ;

    public final void mm(){
        double a = 10;
        System.out.println(name);
    }

}


