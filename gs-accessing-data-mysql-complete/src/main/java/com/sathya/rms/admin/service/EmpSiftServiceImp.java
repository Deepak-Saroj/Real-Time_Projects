package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.EmpSiftRepository;
import com.sathya.rms.admin.entity.EmpSift;

@Service
public class EmpSiftServiceImp implements EmpSiftService {
	@Autowired
	EmpSiftRepository empSiftRepository;
	
	public Iterable<EmpSift> SelectAllEmpSift()
	{
		
		return empSiftRepository.findAll();
		
	}
		  @Transactional public EmpSift insertEmpSift(EmpSift empSift) { 
			  
			  return empSiftRepository.save(empSift);
			  }
		  
		  @Transactional public EmpSift updateEmpSift(EmpSift empSift) { 
			  return empSiftRepository.save(empSift); 
			  }
		  
		  @Transactional public void DeleteEmpSift(Integer id) {
			  
			  empSiftRepository.deleteById(id); 
			  }
	



}
