package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.ShiftRepository;
import com.sathya.rms.admin.entity.Shifts;

@Service
public class ShiftServiceImp implements ShiftService {
	@Autowired
	ShiftRepository shiftRepository;
	
	public Iterable<Shifts> SelectAllShift()
	{
		
		return shiftRepository.findAll();
		
	}
	  @Transactional 
	  public Shifts insertShift(Shifts Shift) { 
		  
		  return shiftRepository.save(Shift);
		  }
	  
	  @Transactional 
	  public Shifts updateShift(Shifts Shift) { 
		  return shiftRepository.save(Shift); 
		  }
	  
	  @Transactional
	  public void DeleteShift(Integer id) {
		  
		  shiftRepository.deleteById(id); 
		  }
	



}
