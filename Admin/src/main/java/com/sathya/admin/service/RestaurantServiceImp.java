package com.sathya.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.RestaurantRepository;
import com.sathya.admin.entity.Restaurant;

@Service
public class RestaurantServiceImp implements RestaurantService {
	@Autowired
	RestaurantRepository restaurantRepository;
	
	public Iterable<Restaurant> SelectAllRestaurant()
	{
		return restaurantRepository.findAll();
		
	}
		  @Transactional 
		  public Restaurant insertRestaurant(Restaurant restaurant) { 
			  
			  return restaurantRepository.save(restaurant);
			  }
		  
		  @Transactional 
		  public Restaurant updateRestaurant(Restaurant restaurant) { 
			  return restaurantRepository.save(restaurant); 
			  }
		  
		  @Transactional 
		  public void DeleteRestaurant(Integer id) {
			  
			  restaurantRepository.deleteById(id); 
			  }
	



}
