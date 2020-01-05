package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Location;

public interface LocationRepository extends CrudRepository<Location,Integer> {
	
}
