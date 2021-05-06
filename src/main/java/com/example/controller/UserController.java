package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping("/")
	public String Hello() {
		return "Hello World..!";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
