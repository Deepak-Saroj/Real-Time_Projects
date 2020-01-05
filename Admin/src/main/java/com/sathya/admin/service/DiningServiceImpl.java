package com.sathya.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.DiningRepository;
import com.sathya.admin.entity.Dining;

@Service
public class DiningServiceImpl implements DiningService {
	@Autowired
	DiningRepository diningRepository;
	
	public Iterable<Dining> SelectAllDiningRecord()
	{
		
		return diningRepository.findAll();
		
	}
		  @Transactional public Dining insertDining(Dining dining) { 
			  
			  return diningRepository.save(dining);
			  }
		  
		  @Transactional public Dining updateDining(Dining dining) { 
			  return diningRepository.save(dining); 
			  }
		  
		  @Transactional public void DeleteDining(Integer id) {
			  
			  diningRepository.deleteById(id); 
			  }
		 



}
