package com.wishnoo.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read form data
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = "Yo! " + theName;
		
		// create the message
		model.addAttribute("message", theName);
		
		// add message to the model
		return "helloworld";
	}
}
