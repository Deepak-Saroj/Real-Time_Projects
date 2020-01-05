package com.sathya.admin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entity.City;
import com.sathya.admin.entity.State;
import com.sathya.admin.service.CityService;
import com.sathya.admin.service.StateService;

@RestController
@RequestMapping(path="/City")
@CrossOrigin
public class CityController {
	@Autowired
	CityService cityService;
	@Autowired
	StateService stateService;
	
	@GetMapping(path="/getAllcity")
	public Iterable<City> getAllData()
	{
		
		return cityService.SelectAllCity();
		
	}
	
	  @PostMapping(path="/insertLocation") 
	  public City addCity(@RequestBody City city)
	  {
		 // return cityService.insertCity(City);
		  City result=null;
		  Optional<State> Ostate=stateService.findByStId(city.getStId());
		  if(Ostate.get()!=null)
		  {
			  city.setState(Ostate.get());
			  result=cityService.insertCity(city);
		  }
		  return result;
	  }
	  
	  @PutMapping(path="/updateCity") 
	  public City updateCity(@RequestBody City City)
	  {
		  return cityService.updateCity(City);
	  }
	  
	  @DeleteMapping(path="/DeleteCity/{id}") 
	  public void DeleteCity(@PathVariable("id") Integer id)
	  {
		  cityService.DeleteCity(id);
	  }
	  
}
