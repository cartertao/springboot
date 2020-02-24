package com.example.demo.MyStart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
   public TestBean1 test(){
        TestBean1 testBean1 = new TestBean1();
        testBean1.setSeq("10");
       return testBean1;
   }

    public TestBean1 test1(){
        TestBean1 testBean1 = new TestBean1();
        testBean1.setSeq("20");
        return testBean1;
    }
}
