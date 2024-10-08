package com.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class JWTController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("getting Users");
		return this.service.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
