package com.sathya.admin.service;

import com.sathya.admin.entity.City;

public interface CityService {

	public Iterable<City> SelectAllCity();
	public City insertCity(City city);
	public City updateCity(City city);
	public void DeleteCity(Integer id);
}
