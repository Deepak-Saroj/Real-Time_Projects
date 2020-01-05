package com.sathya.rms.admin.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.Location;
import com.sathya.rms.admin.service.LocationService;

@RestController
@RequestMapping(path="/Location")
public class LocationController {
	@Autowired
	LocationService LocationService;
	
	@GetMapping(path="/getAllLocation")
	public Iterable<Location> getAllData()
	{
		
		return LocationService.SelectAllLocation();
		
	}
	
	  @PostMapping(path="/insertLocation") 
	  public Location addLocation(@RequestBody Location location)
	  {
		  return LocationService.insertLocation(location);
	  }
	  
	  @PutMapping(path="/updateLocation") 
	  public Location updateLocation(@RequestBody Location location)
	  {
		  return LocationService.updateLocation(location);
	  }
	  
	  @DeleteMapping(path="/DeleteLocation/{id}") 
	  public void DeleteLocation(@PathVariable("id") Integer id)
	  {
		  LocationService.deleteLocation(id);
	  }
	  
}
