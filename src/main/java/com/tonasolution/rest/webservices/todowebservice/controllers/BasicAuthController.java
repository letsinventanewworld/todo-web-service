package com.tonasolution.rest.webservices.todowebservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tonasolution.rest.webservices.todowebservice.entity.AuthenticationBean;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthController {
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorld() {
		return new AuthenticationBean("You are authenticated");
	}
	
}
