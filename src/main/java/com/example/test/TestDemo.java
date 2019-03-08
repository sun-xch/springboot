package com.example.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.example.test.TestApplicationTests;

public class TestDemo extends TestApplicationTests{

	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	
	@Test
	public void testRedis(){
		redisTemplate.opsForValue().set("name","tom");
		System.out.println(redisTemplate.opsForValue().get("name"));
	}
	
}
