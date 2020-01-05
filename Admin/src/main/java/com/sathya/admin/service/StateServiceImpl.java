package com.sathya.admin.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.admin.data.StateRepository;
import com.sathya.admin.entity.State;

@Service
public class StateServiceImpl implements StateService {
	@Autowired
	StateRepository stateRepository;
	
	public Iterable<State> SelectData()
	{
		
		return stateRepository.findAll();
		
	}
@Transactional
	public State insertState(State state) {
		// TODO Auto-generated method stub
		return stateRepository.save(state);
	}
@Transactional
public State updateRecord(State state) {
	// TODO Auto-generated method stub
	return stateRepository.save(state);
}
@Transactional
public void DeleteRecord(Integer id) {
	// TODO Auto-generated method stub
	stateRepository.deleteById(id);
}
@Override
public Optional<State> findByStId(String stid) {
	// TODO Auto-generated method stub
	return stateRepository.findBystId(stid);
}

}
