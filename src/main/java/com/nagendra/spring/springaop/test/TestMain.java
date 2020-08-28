package com.nagendra.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nagendra.spring.springaop.ProductService;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagendra/spring/springaop/test/config.xml");
		ProductService ps = (ProductService) context.getBean("productService");
		System.out.println("Result is : " + ps.multiply(40, 60));
	}
}
