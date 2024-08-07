package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		//Student s1 = conn.getBean("student",Student.class);
		Student s1 = conn.getBean("ob",Student.class);
		System.out.println(s1);
		
		System.out.println(s1.getAddress());
		System.out.println("======================================");
		System.out.println(s1.getAddress().getClass().getName());
		System.out.println("Hashcode: " + s1.hashCode());
		
		Student s2 = conn.getBean("ob",Student.class);
		System.out.println("Hashcode: " + s2.hashCode());
	}

}
