package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Menu;

public interface MenuRepository extends CrudRepository<Menu,Integer> {
	
}
