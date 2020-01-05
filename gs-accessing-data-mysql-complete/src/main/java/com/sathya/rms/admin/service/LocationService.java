package com.sathya.rms.admin.service;
import com.sathya.rms.admin.entity.Location;

public interface LocationService {

	public Iterable<Location> SelectAllLocation();
	public Location insertLocation(Location Location);
	public Location updateLocation(Location Location);
	public void deleteLocation(Integer id);
}
