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

import com.sathya.rms.admin.entity.Employee;
import com.sathya.rms.admin.service.EmployeeService;

@RestController
@RequestMapping(path="/Employee")
@CrossOrigin
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<Employee> getAllData()
	{
		
		return employeeService.SelectAllEmployee();
		
	}
	
	
  @PostMapping(path="/newRecord") 
  public Employee addEmployee(@RequestBody Employee  employee)
  {
	  return employeeService.insertEmployee(employee); 
	  
  }
  
  @PutMapping(path="/updateRecord") 
  public Employee updateEmployee(@RequestBody Employee  employee)
  {
	  return employeeService.updateEmployee(employee);
	  
  }
  
  @DeleteMapping(path="/DeleteRecord/{id}") 
  public void  DeleteEmployee(@PathVariable("id") Integer id) 
  {
	  employeeService.DeleteEmployee(id); 
	  
  }
 
  
}
