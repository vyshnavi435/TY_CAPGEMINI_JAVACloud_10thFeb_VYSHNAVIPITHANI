package com.capgemini.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the beans from spring container

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		


		// close the context
		context.close();
	}

}
