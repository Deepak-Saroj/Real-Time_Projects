package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.RestDiningRepository;
import com.sathya.rms.admin.entity.RestDining;

@Service
public class RestDiningServiceImp implements RestDiningService {
	@Autowired
	RestDiningRepository restDiningRepository;
	
	public Iterable<RestDining> SelectAllRestDining()
	{
		return restDiningRepository.findAll();
		
	}
		  @Transactional 
		  public RestDining insertRestDining(RestDining restDining) { 
			  
			  return restDiningRepository.save(restDining);
			  }
		  
		  @Transactional 
		  public RestDining updateRestDining(RestDining restDining) { 
			  return restDiningRepository.save(restDining); 
			  }
		  
		  @Transactional 
		  public void DeleteRestDining(Integer id) {
			  
			  restDiningRepository.deleteById(id); 
			  }
	



}
