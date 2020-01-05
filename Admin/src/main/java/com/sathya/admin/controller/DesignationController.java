package com.sathya.admin.controller;

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

import com.sathya.admin.entity.Designation;
import com.sathya.admin.service.DesignationService;

@RestController
@RequestMapping(path="/Designations")
@CrossOrigin
public class DesignationController {
	@Autowired
	DesignationService designationService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<Designation> getAllData()
	{
		
		return designationService.SelectAllDesignation();
		
	}
	
  @PostMapping(path="/newRecord") 
  public Designation addDesignation(@RequestBody Designation  designation)
  {
	  return designationService.insertDesignation(designation); 
	  
  }
  
  @PutMapping(path="/updateRecord") 
  public Designation updateDesignation(@RequestBody Designation  designation)
  {
	  return designationService.updateDesignation(designation);
	  
  }
  
  @DeleteMapping(path="/DeleteRecord/{id}") 
  public void  DeleteDesignation(@PathVariable("id") Integer id) 
  {
	  designationService.DeleteDesignation(id); 
	  
  }
 
  
}
