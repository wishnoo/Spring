package com.demo.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	private BasketballCoach() {
		System.out.println(">> BasketballCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Put more balls into the net";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
