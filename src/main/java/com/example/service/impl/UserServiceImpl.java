package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.UserModel;
import com.example.repository.IUserRepository;
import com.example.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepository iUserRepository;
	
	@Override
	public UserModel postData(UserModel userModel) {

		return iUserRepository.save(userModel);
	}

}
