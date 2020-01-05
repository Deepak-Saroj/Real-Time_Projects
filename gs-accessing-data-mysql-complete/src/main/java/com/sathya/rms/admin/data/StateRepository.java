package com.sathya.rms.admin.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.State;

public interface StateRepository extends CrudRepository<State,Integer> {
	Optional<State> findBystId(String stid);
	
}
