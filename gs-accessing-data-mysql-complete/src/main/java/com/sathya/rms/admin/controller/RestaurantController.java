package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.Restaurant;
import com.sathya.rms.admin.service.RestaurantService;

@RestController
@RequestMapping(path="/Restaurant")
public class RestaurantController {
	@Autowired
	RestaurantService RestaurantService;
	
	@GetMapping(path="/getAllRecord")
	public Iterable<Restaurant> getAllData()
	{
		
		return RestaurantService.SelectAllRestaurant();
		
	}
	
	
  @PostMapping(path="/newRecord") 
  public Restaurant addRestaurant(@RequestBody Restaurant  Restaurant)
  {
	  return RestaurantService.insertRestaurant(Restaurant); 
	  
  }
  
  @PutMapping(path="/updateRecord") 
  public Restaurant updateRestaurant(@RequestBody Restaurant  Restaurant)
  {
	  return RestaurantService.updateRestaurant(Restaurant);
	  
  }
  
  @DeleteMapping(path="/DeleteRecord/{id}") 
  public void  DeleteRestaurant(@PathVariable("id") Integer id) 
  {
	  RestaurantService.DeleteRestaurant(id); 
	  
  }
 
  
}
