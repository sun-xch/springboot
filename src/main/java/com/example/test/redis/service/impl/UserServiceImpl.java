package com.example.test.redis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.test.redis.dao.UserDao;
import com.example.test.redis.entity.User;
import com.example.test.redis.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Resource
	private UserDao userDao;
	
	@Override
	@Cacheable(value="user#60")
	public List<User> getAll() {
		List<User> list = userDao.getAll();
		return list;
	}

}
