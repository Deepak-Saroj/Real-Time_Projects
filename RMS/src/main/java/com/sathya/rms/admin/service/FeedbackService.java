package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Feedback;

public interface FeedbackService {

	public Iterable<Feedback> SelectAllFeedback();
	public Feedback insertFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public void DeleteFeedback(String uid);
}
