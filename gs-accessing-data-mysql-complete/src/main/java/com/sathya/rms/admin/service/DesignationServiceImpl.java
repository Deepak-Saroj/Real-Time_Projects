package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.DesignationRepository;
import com.sathya.rms.admin.entity.Designation;

@Service
public class DesignationServiceImpl implements DesignationService {
	@Autowired
	DesignationRepository designationRepository;
	
	public Iterable<Designation> SelectAllDesignation()
	{
		
		return designationRepository.findAll();
		
	}
		  @Transactional public Designation insertDesignation(Designation designation) { 
			  
			  return designationRepository.save(designation);
			  }
		  
		  @Transactional public Designation updateDesignation(Designation designation) { 
			  return designationRepository.save(designation); 
			  }
		  
		  @Transactional public void DeleteDesignation(Integer id) {
			  
			  designationRepository.deleteById(id); 
			  }
	



}
