package com.mvc.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Model model) {
		
		for(int i = 0; i < 1000; i++){
			logger.debug("welcome() is executed, value {}", "mvc-logback");
			logger.error("This is Error message", new Exception("Testing"));
		}
		model.addAttribute("msg", "Hello Spring MVC + Logback");
		return "welcome";

	}

}