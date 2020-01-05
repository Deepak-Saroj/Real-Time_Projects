package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Employee;

public interface EmployeeService {

	public Iterable<Employee> SelectAllEmployee();
	public Employee insertEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void DeleteEmployee(Integer id);
}
