package com.springboot.tao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class DemoApplicationTests {

	private int a =1;

	@Test
	void contextLoads() {
		char a = 'm';
		char b = 'm';
		System.out.println(a == b);
	}

	public int mm(){
		try{
			int a = 1/0;
		}catch (Exception e){
			return add(a);
		}finally {
			System.out.println("ddd");
		}
		return 20;
	}

	public int add(int i){
		return (a = i +1);
	}
}
