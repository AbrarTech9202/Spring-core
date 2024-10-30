package com.springmethods.init.destroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springmethods/init/destroy/method.cfg.xml");
		Student student=(Student) context.getBean("student");
		System.out.println(student);
//		regestring shut down hook
		context.registerShutdownHook();
	}

}
