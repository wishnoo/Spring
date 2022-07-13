package com.demo.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String filePath = "C:/Users/wishn/Documents/fortune-data.txt";
	private ArrayList<String> theFortunes;
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside default constructor");
	}
	@Override
	public String getFortune() {
		// Create a Random object 
		Random rand = new Random();
		int index = rand.nextInt(theFortunes.size());
		return theFortunes.get(index);
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> FileFortuneService: inside of doMyStartupStuff()");
		File file = new File(filePath);
		
		System.out.println("Reading fortunes from file: " + file);
		System.out.println("File exists: " + file.exists());
		
		theFortunes = new ArrayList<>();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
			
			String fortuneLine;
			while((fortuneLine = bufferedReader.readLine()) != null) {
				theFortunes.add(fortuneLine);
				System.out.println(fortuneLine);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
