package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant,Integer> {
	
}
