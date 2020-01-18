package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.Feedback;
import com.sathya.rms.admin.service.FeedbackService;

@RestController
@RequestMapping(path="/Feedback")
@CrossOrigin
public class FeedbackController {

	@Autowired
	FeedbackService fbs;
	
	@GetMapping(path="/selectAllRecord")
	public Iterable<Feedback> selectRecord()
	{
		return fbs.SelectAllFeedback();
	}
	
	
	@PostMapping(path="/insertRecord")
	public Feedback insertRecord(@RequestBody Feedback fb)
	{
		return fbs.insertFeedback(fb);
	}
	@PutMapping(path="/updateRecord")
	public Feedback updateRecord(@RequestBody Feedback fb)
	{
		return fbs.updateFeedback(fb);
	}
	@DeleteMapping(path="/deleteRecord/{fbid}")
	public void deleteRecord(@PathVariable ("fbid") String fbid)
	{
		 fbs.DeleteFeedback(fbid);
	}
	
}
