package com.demo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeConfig {

	@Bean
	public FortuneService elasticFortuneService() {
		return new ElasticFortuneService();
	}
	@Bean
	public Coach badmintonCoach() {
		return new BadmintonCoach(elasticFortuneService());
	}
	
}
