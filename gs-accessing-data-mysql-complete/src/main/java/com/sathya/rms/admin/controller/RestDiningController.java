package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.RestDining;
import com.sathya.rms.admin.service.RestDiningService;

@RestController
@RequestMapping(path="/RestDining")
public class RestDiningController {
	@Autowired
	RestDiningService restDiningService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<RestDining> getAllData()
	{
		
		return restDiningService.SelectAllRestDining();
		
	}
	
	
  @PostMapping(path="/newRecord") 
  public RestDining addRestDining(@RequestBody RestDining  restDining)
  {
	  return restDiningService.insertRestDining(restDining); 
	  
  }
  
  @PutMapping(path="/updateRecord") 
  public RestDining updateRestDining(@RequestBody RestDining  restDining)
  {
	  return restDiningService.updateRestDining(restDining);
	  
  }
  
  @DeleteMapping(path="/DeleteRecord/{id}") 
  public void  DeleteRestDining(@PathVariable("id") Integer id) 
  {
	  restDiningService.DeleteRestDining(id); 
	  
  }
 
  
}
