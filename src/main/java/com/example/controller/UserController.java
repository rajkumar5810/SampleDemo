package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService iUserService;
	
	@RequestMapping("/")
	public String Hello() {
		return "Hello World..!";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@PostMapping("/insertData")
	public UserModel insertData(@RequestBody UserModel userModel) {
		
		return iUserService.postData(userModel);
	}
}
