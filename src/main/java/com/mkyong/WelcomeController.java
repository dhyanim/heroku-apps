package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	/*// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";*/

	@RequestMapping("/spring-boot")
	public String welcome(Map<String, Object> model, @RequestParam("name") String name) {
		model.put("message", "Hello "+name);
		return "welcome";
	}

}