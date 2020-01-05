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

import com.sathya.admin.entity.Dining;
import com.sathya.admin.service.DiningService;

@RestController
@RequestMapping(path="/Dinings")
@CrossOrigin
public class DiningController {
	@Autowired
	DiningService diningService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<Dining> getAllData()
	{
		
		return diningService.SelectAllDiningRecord();
		
	}
	
	
	  @PostMapping(path="/newRecord") public Dining adddining(@RequestBody Dining
	  dining) { return diningService.insertDining(dining); }
	  
	  @PutMapping(path="/updateRecord") public Dining updatedining(@RequestBody Dining
	  dining) { return diningService.updateDining(dining); }
	  
	  @DeleteMapping(path="/DeleteRecord/{id}") public void
	  Deletedining(@PathVariable("id") Integer id) { diningService.DeleteDining(id); }
	 
	  
}
