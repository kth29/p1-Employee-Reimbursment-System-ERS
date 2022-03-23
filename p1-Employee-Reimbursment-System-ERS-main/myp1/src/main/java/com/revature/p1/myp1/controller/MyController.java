package com.revature.p1.myp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to SpringBoot!";
	}
	

}
