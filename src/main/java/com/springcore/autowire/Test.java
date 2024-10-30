package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation.cfg.xml");
		Address add=(Address) context.getBean("address");
		System.out.println(add);
	}

}
