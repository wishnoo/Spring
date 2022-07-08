package com.demo.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = {"Lucky", "Unlucky", "Middle ground"};
		Random random = new Random();
		return fortunes[random.nextInt(fortunes.length)];
	}

}
