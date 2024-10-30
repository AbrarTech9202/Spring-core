package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/auto/autowire.cfg.xml");
		Employee emp1=context.getBean("emp",Employee.class);
		System.out.println(emp1);
	}

}
