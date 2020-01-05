package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.LocationRepository;
import com.sathya.rms.admin.entity.Location;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	LocationRepository locationRepository;
	
	public Iterable<Location> SelectAllLocation()
	{
		
		return locationRepository.findAll();
		
	}
@Transactional
	public Location insertLocation(Location Location) {
		// TODO Auto-generated method stub
		return locationRepository.save(Location);
	}
@Transactional
public Location updateLocation(Location Location) {
	// TODO Auto-generated method stub
	return locationRepository.save(Location);
}
@Transactional
public void deleteLocation(Integer id) {
	// TODO Auto-generated method stub
	locationRepository.deleteById(id);
}

}
