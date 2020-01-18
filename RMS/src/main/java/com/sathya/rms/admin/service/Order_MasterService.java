package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Order_Master;

public interface Order_MasterService {
	Iterable<Order_Master> selectAllRecord();
	Order_Master insertRecord(Order_Master om);
	Order_Master updateRecord(Order_Master om);
	Order_Master deleteByOmid(String omid);
	Order_Master selectByOmid(String omid);
	

}
