package com.example.test.quartz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.test.quartz.entity.JobAndTrigger;


@Repository
public interface JobAndTriggerMapper {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
