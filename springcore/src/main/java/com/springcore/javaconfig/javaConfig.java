package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"student","s1","studentObj"})
	public Student getStudent() {
		
		Student student = new Student(getSamosa());
		return student;
	}

}
