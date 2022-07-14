package com.demo.springdemo;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Pratice 1000 servers";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
