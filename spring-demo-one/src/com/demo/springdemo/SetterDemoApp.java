package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		
		// Use the bean to call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());;
		
		// Close context
		context.close();
	}

}
