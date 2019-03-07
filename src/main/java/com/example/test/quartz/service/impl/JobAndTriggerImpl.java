package com.example.test.quartz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.quartz.dao.JobAndTriggerMapper;
import com.example.test.quartz.entity.JobAndTrigger;
import com.example.test.quartz.service.IJobAndTriggerService;



@Service
public class JobAndTriggerImpl implements IJobAndTriggerService{

	@Autowired
	private JobAndTriggerMapper jobAndTriggerMapper;
	
	public List<JobAndTrigger> getJobAndTriggerDetails() {
	
		List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
		return list;
	}

}