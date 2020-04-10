package com.capgemini.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor

	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}

	// define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: inside of doMyStartupStuff");
	}

	// define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff");
	}

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	// define a setter method

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//
//		System.out.println(">>TennisCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
