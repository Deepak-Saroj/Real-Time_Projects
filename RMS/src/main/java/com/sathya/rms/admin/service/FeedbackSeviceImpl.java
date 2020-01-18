package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.FeedBackRepository;
import com.sathya.rms.admin.entity.Feedback;
@Service
public class FeedbackSeviceImpl implements FeedbackService {

	@Autowired
	FeedBackRepository fbr;
	
	public Iterable<Feedback> SelectAllFeedback() {
		// TODO Auto-generated method stub
		return fbr.findAll();
	}

	@Transactional
	public Feedback insertFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return fbr.save(feedback);
	}

	@Transactional
	public Feedback updateFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return fbr.save(feedback);
	}

	@Transactional
	public void DeleteFeedback(String uid) {
		// TODO Auto-generated method stub
		fbr.deleteByUid(uid);

	}

}
