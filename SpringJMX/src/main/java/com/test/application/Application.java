package com.test.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String...args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		context.getBean("factory");
		
	}
}
