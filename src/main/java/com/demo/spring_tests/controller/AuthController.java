package com.demo.spring_tests.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_tests.model.User;

@RestController
public class AuthController {
	
	@RequestMapping(value="/authenticate")
	public User authenicate(){
		User user = new User();
		user.setUsername("ABSMA01");
		user.setPassword("test123");
		return user;
	}
	

}
