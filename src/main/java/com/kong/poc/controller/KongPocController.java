package com.kong.poc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KongPocController {

	@RequestMapping("/kong/ping")
	public String healthCheck() {
		return "pong";
	}
	
	
	@RequestMapping("/kong/greet")
	public String greet() {
		return "Hello";
	}
	
	
	
}
