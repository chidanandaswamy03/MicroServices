package com.global.MicroService.limits_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
	
	@GetMapping("/api")
	public String helloWorld() {
		return "hello world!";
	}

}
