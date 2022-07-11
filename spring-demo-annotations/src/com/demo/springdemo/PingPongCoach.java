package com.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
	
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	private PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Play more";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
