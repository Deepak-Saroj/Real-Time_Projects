package com.sathya.admin.service;
import com.sathya.admin.entity.Location;

public interface LocationService {

	public Iterable<Location> SelectAllLocation();
	public Location insertLocation(Location Location);
	public Location updateLocation(Location Location);
	public void deleteLocation(Integer id);
}
