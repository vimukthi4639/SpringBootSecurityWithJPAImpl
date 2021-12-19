package com.springsecurity.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public String helloWorld() {
		return "hi user";
	}
	
	@GetMapping("/admin")
	public String helloAdmin() {
		return "hello admin";
	}
	
	@GetMapping("/home")
	public String home() {
		return "hello admin";
	}

}
