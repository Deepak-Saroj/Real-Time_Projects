package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Employee;
import com.sathya.rms.admin.entity.Feedback;

public interface FeedBackRepository extends CrudRepository<Feedback,Integer> {
	Feedback deleteByUid(String uid);
	
}
