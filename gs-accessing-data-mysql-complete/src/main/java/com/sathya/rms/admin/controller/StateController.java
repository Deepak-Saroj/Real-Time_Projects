package com.sathya.rms.admin.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.State;
import com.sathya.rms.admin.service.StateService;

@RestController
@RequestMapping(path="/state")
public class StateController {
	@Autowired
	StateService stateService;
	private static final Logger logger = LogManager.getLogger(StateController.class);
	@GetMapping(path="/getAllState")
	public Iterable<State> getAllData()
	{
		
		//return stateService.SelectData();
		logger.info("get All states method execution started");
		Iterable<State> result = null;
		try {
			result = stateService.SelectData();
			logger.debug("result is {0}",result);
		}
		catch(Exception e) {
			logger.error("exception happens and exception info is {0} ",e);
		}
		logger.info("get All states method execution completed");
		
		return result;
		
	}
	
	  @PostMapping(path="/insert") 
	  public State addState(@RequestBody State state)
	  {
		  //return stateService.insertState(state);
		  logger.info("add states method execution started");
			State result = null;
			try {
				result = stateService.insertState(state);
				logger.debug("result is {0}",result);
			}
			catch(Exception e) {
				logger.error("exception happens and exception info is {0} ",e);
			}
			logger.info("add states method execution completed");
			
			return result;
	  }
	  
	  @PutMapping(path="/updateState") 
	  public State updateState(@RequestBody State state)
	  {
		  return stateService.updateRecord(state);
	  }
	  
	  @DeleteMapping(path="/DeleteState/{id}") 
	  public void DeleteState(@PathVariable("id") Integer id)
	  {
		  stateService.DeleteRecord(id);
	  }
	  
}
