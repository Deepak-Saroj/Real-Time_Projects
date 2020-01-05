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

import com.sathya.rms.admin.entity.EmpSift;
import com.sathya.rms.admin.service.EmpSiftService;

@RestController
@RequestMapping(path="/EmpSift")
public class EmpSiftController {
	@Autowired
	EmpSiftService empSiftService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<EmpSift> getAllData()
	{
		
		return empSiftService.SelectAllEmpSift();
		
	}
	
	
  @PostMapping(path="/newRecord") 
  public EmpSift addEmpSift(@RequestBody EmpSift  empSift)
  {
	  return empSiftService.insertEmpSift(empSift); 
	  
  }
  
  @PutMapping(path="/updateRecord") 
  public EmpSift updateEmpSift(@RequestBody EmpSift  empSift)
  {
	  return empSiftService.updateEmpSift(empSift);
	  
  }
  
  @DeleteMapping(path="/DeleteRecord/{id}") 
  public void  DeleteEmpSift(@PathVariable("id") Integer id) 
  {
	  empSiftService.DeleteEmpSift(id); 
	  
  }
 
  
}
