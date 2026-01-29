package com.global.MicroService.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.global.MicroService.limits_service.configuration.Configuration;

import com.global.MicroService.limits_service.bean.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
//		return new Limits(1, 1000);
		
	}

}
