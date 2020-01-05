package com.sathya.rms.Example1.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.Example1.Entity.Orders;

public interface OrdersRepository extends CrudRepository<Orders,Integer> {
	
}
