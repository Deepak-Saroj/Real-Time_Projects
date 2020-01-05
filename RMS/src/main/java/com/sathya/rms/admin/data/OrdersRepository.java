package com.sathya.rms.admin.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Orders;

public interface OrdersRepository extends CrudRepository<Orders,Integer> {
	
}
