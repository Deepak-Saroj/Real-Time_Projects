package com.sathya.admin.service;

import com.sathya.admin.entity.Dining;

public interface DiningService {

	public Iterable<Dining> SelectAllDiningRecord();
	
	  public Dining insertDining(Dining dining); 
	  public Dining updateDining(Dining dining); public
	  void DeleteDining(Integer id);
	 
}
