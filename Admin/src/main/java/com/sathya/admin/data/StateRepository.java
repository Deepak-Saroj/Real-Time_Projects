package com.sathya.admin.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.admin.entity.State;

public interface StateRepository extends CrudRepository<State,Integer> {
	Optional<State> findBystId(String stid);
	void deleteByStid(String stid);
	
}
