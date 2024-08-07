package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		//Student s1 = context.getBean("student1",Student.class);
		Student s1 = context.getBean("studentObj",Student.class);
		System.out.println(s1);
		s1.study();
		

	}

}
