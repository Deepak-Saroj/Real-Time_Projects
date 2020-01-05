package com.sathya.rms.Example1.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.Example1.Entity.Menu;

public interface MenuRepository extends CrudRepository<Menu,Integer> {
	
}
