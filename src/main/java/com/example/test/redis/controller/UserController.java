package com.example.test.redis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.redis.entity.User;
import com.example.test.redis.service.impl.UserServiceImpl;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Resource
	private UserServiceImpl userServiceImpl;
	
	
	@RequestMapping("/list")
	public List<User> getAll(){
		return userServiceImpl.getAll();
	}
	
	
	
}
