package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDemoApp {
	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);

		// call a method on the bean
		System.out.println(coach.getDailyWorkout());

		// call method to get the daily fortune
		System.out.println(coach.getDailyFortune());

		// close the context
		context.close();
	}

}
