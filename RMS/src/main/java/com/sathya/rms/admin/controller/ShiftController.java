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

import com.sathya.rms.admin.entity.Shifts;
import com.sathya.rms.admin.service.ShiftService;

@RestController
@RequestMapping(path="/Shift")
@CrossOrigin
public class ShiftController {
	@Autowired
	ShiftService shiftService;
	
	@GetMapping(path="/getAllShifts")
	public Iterable<Shifts> getAllData()
	{
		
		return shiftService.SelectAllShift();
		
	}
	
	
  @PostMapping(path="/newShifts") 
  public Shifts addShift(@RequestBody Shifts  Shift)
  {
	  return shiftService.insertShift(Shift); 
	  
  }
  
  @PutMapping(path="/updateShifts") 
  public Shifts updateShift(@RequestBody Shifts  Shift)
  {
	  return shiftService.updateShift(Shift);
	  
  }
  
  @DeleteMapping(path="/DeleteShifts/{id}") 
  public void  DeleteShift(@PathVariable("id") Integer id) 
  {
	  shiftService.DeleteShift(id); 
	  
  }
 
  
}
