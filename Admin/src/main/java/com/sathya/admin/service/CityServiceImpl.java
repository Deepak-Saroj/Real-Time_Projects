package com.sathya.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.CityRepository;
import com.sathya.admin.entity.City;

@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityRepository cityRepository;
	
	public Iterable<City> SelectAllCity()
	{
		
		return cityRepository.findAll();
		
	}
@Transactional
	public City insertCity(City City) {
		// TODO Auto-generated method stub
		return cityRepository.save(City);
	}
@Transactional
public City updateCity(City City) {
	// TODO Auto-generated method stub
	return cityRepository.save(City);
}
@Transactional
public void DeleteCity(String id) {
	// TODO Auto-generated method stub
	cityRepository.deleteByCid(id);
}



}
