package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Designation;

public interface DesignationRepository extends CrudRepository<Designation,Integer> {
	
}
