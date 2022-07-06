package com.demo.springdemo;

public class BaseballCoach implements Coach{

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting pratice";
	}

	@Override
	public String getDailyFortune() {
		// use the fortune service to get a fortune.
		return fortuneService.getFortune();
	}
}
