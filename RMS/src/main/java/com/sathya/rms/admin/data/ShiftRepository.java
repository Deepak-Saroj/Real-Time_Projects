package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Shifts;

public interface ShiftRepository extends CrudRepository<Shifts,Integer> {
	
}
