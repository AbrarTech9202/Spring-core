package com.springcore.refrence;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {

		BeanFactory factory = new ClassPathXmlApplicationContext("com/springcore/core.cfg.xml");
//		 Class<?> getType=factory.getType("college");
		boolean isSingleton = factory.isSingleton("college");
//		boolean containsBean = factory.containsBean("aaamir");
//		System.out.println(containsBean);
		College sum1 = (College) factory.getBean("college");
		System.out.println(sum1.getId() + " : " + sum1.getStdName() + " : " + sum1.getName());
		System.out.println(sum1);

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/core.cfg.xml");
//
//		College sum = (College) context.getBean("college");
//		System.out.println(sum.getId() + " : " + sum.getStdName() + " : " + sum.getName());
//		System.out.println(sum);
	}

}
