package com.sathya.rms.admin.data;


import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.admin.entity.Order_Master;

public interface OrderMasterRepository extends CrudRepository<Order_Master,Integer> {
	Order_Master findByOmid(String omid);
	Order_Master deleteByOmid(String omid);
}
