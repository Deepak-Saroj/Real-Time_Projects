package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.SiftTypeRepository;
import com.sathya.rms.admin.entity.SiftType;

@Service
public class SiftTypeServiceImp implements SiftTypeService {
	@Autowired
	SiftTypeRepository siftTypeRepository;
	
	public Iterable<SiftType> SelectAllSiftType()
	{
		return siftTypeRepository.findAll();
		
	}
		  @Transactional 
		  public SiftType insertSiftType(SiftType siftType) { 
			  
			  return siftTypeRepository.save(siftType);
			  }
		  
		  @Transactional 
		  public SiftType updateSiftType(SiftType siftType) { 
			  return siftTypeRepository.save(siftType); 
			  }
		  
		  @Transactional 
		  public void DeleteSiftType(Integer id) {
			  
			  siftTypeRepository.deleteById(id); 
			  }
	



}
