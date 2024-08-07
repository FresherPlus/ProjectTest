package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");

		Demo d1 = con.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		
		// This is the way by which u can solve expression but @Value is used generally for object creation
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression e1 = temp.parseExpression("11+44+99");
		System.out.println(e1.getValue());
	}

}
