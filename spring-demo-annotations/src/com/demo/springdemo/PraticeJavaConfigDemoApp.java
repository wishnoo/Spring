package com.demo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PraticeJavaConfigDemoApp {
	
	public static void main(String args[]) {
		// load the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeConfig.class);
		
		// Retrieve the bean from container
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		// Use methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
