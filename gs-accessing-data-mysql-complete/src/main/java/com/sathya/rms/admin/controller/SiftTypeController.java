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

import com.sathya.rms.admin.entity.SiftType;
import com.sathya.rms.admin.service.SiftTypeService;

@RestController
@RequestMapping(path="/SiftType")
public class SiftTypeController {
	@Autowired
	SiftTypeService siftTypeService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<SiftType> getAllData()
	{
		
		return siftTypeService.SelectAllSiftType();
		
	}
	
	
  @PostMapping(path="/newRecord") 
  public SiftType addSiftType(@RequestBody SiftType  siftType)
  {
	  return siftTypeService.insertSiftType(siftType); 
	  
  }
  
  @PutMapping(path="/updateRecord") 
  public SiftType updateSiftType(@RequestBody SiftType  siftType)
  {
	  return siftTypeService.updateSiftType(siftType);
	  
  }
  
  @DeleteMapping(path="/DeleteRecord/{id}") 
  public void  DeleteSiftType(@PathVariable("id") Integer id) 
  {
	  siftTypeService.DeleteSiftType(id); 
	  
  }
 
  
}
