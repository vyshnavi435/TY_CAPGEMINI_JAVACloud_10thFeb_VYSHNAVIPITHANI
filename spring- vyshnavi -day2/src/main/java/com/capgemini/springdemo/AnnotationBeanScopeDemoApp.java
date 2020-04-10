package com.capgemini.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the beans from spring container

		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are same
		boolean result = (theCoach == alphaCoach);

		// print the results

		System.out.println("\npointing to the same object: " + result);

		System.out.println("\nmemory location for theCoach: " + theCoach);

		System.out.println("\nmemory location for alphaCoach: " + alphaCoach + "\n");

		// close the context
		context.close();

	}

}
