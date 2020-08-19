package com.springboot.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@MapperScan(basePackages = "com.springboot.tao.dao")
@EnableAsync
@ServletComponentScan("com.springboot.tao.configer.filters")
public class DemoApplication {

	public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args);
	}

}
