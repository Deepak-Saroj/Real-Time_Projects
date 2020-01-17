package com.sathya.admin.service;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.sathya.admin.entity.State;

public interface StateService {

	public Iterable<State> SelectData();
	public State insertState(State state);
	public State updateRecord(State state);
	public void DeleteRecord(String id);
	Optional<State> findByStId(String stid);
}
