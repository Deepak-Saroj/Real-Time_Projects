package com.sathya.rms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.StudentRepository;
import com.sathya.rms.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studRepo;
	
	@Transactional
	public Student saveData(Student student) {
		// TODO Auto-generated method stub
		
		return studRepo.save(student) ;
	}

}
