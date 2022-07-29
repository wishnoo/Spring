package com.wishnoo.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	// same requestMapping path as HelloWorldController
	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly";
	}
}
