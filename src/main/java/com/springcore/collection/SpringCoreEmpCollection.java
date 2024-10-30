package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreEmpCollection {
	
	public static void main(String[] args) {

		 ApplicationContext context =   new ClassPathXmlApplicationContext("com/springcore/collection/collect.cfg.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getEmpId());
		System.out.println();
        System.out.println(employee.getEmpName());
        System.out.println();
        System.out.println(employee.getEmpPhone());
        System.out.println();
       System.out.println(employee.getEmpAddress());
	}

}
