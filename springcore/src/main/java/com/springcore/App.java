package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
	
	public static void main(String args[]) {
		System.out.println("Hello Word");
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		student student1 = (student) context.getBean("student1");
		System.out.println(student1);
		
	}

}
