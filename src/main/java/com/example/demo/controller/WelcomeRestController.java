package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class WelcomeRestController {

	@GetMapping("/test")
	public String welcomeMsg() {
		return "Welcome to the AWS application.";
	}
}
