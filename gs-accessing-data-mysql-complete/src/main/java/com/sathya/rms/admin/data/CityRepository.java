package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.City;

public interface CityRepository extends CrudRepository<City,Integer> {
	
}
