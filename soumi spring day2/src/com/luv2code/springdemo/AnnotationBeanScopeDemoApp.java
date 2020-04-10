package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		Coach coach2 = context.getBean("tennisCoach",Coach.class);
		
		//check if they are same
		boolean result = (coach == coach2);
		
		//print out the results
		System.out.println(result);
		
		System.out.println(coach);
		
		System.out.println(coach2);
		
		context.close();
		
	}
	

}
