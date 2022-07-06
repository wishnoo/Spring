package com.demo.springdemo;

public class CricketCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public CricketCoach() {}
		
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend some time bowling at 150 kmph";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it!" + fortuneService.getFortune();
	}

}
