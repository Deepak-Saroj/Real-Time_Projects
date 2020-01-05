package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entity.Student;
import com.sathya.rms.service.AddressService;
import com.sathya.rms.service.StudentService;

@RestController
@RequestMapping(path="/Student")
public class StudentController {
	
	@Autowired
	StudentService studServ;
	@Autowired
	AddressService adderServ;
	
	@PostMapping(path="/savingData")
	public Student inserting(@RequestBody Student student)
	{
		adderServ.saveData(student.getAddress());
		return studServ.saveData(student);
	}

}
