package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.City;

public interface CityService {

	public Iterable<City> SelectAllCity();
	public City insertCity(City city);
	public City updateCity(City city);
	public void DeleteCity(Integer id);
}
