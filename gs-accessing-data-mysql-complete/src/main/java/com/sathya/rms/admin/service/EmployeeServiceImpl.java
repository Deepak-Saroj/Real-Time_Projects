package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.EmployeeRepository;
import com.sathya.rms.admin.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Iterable<Employee> SelectAllEmployee()
	{
		
		return employeeRepository.findAll();
		
	}
		  @Transactional public Employee insertEmployee(Employee employee) { 
			  
			  return employeeRepository.save(employee);
			  }
		  
		  @Transactional public Employee updateEmployee(Employee employee) { 
			  return employeeRepository.save(employee); 
			  }
		  
		  @Transactional public void DeleteEmployee(Integer id) {
			  
			  employeeRepository.deleteById(id); 
			  }
	



}
