package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.OrderMasterRepository;
import com.sathya.rms.admin.entity.Order_Master;
@Service
public class Order_MasterServiceImpl implements Order_MasterService {

	@Autowired
	OrderMasterRepository  omr;
	
	
	public Iterable<Order_Master> selectAllRecord() {
		return omr.findAll();
	}

	@Transactional
	public Order_Master insertRecord(Order_Master om) {
		return omr.save(om);
	}

	@Transactional
	public Order_Master updateRecord(Order_Master om) {
		return omr.save(om);
	}

	@Transactional
	public Order_Master deleteByOmid(String omid) {
		 return omr.deleteByOmid(omid);
	}

	
	public Order_Master selectByOmid(String omid) {
		return omr.findByOmid(omid);
	}

}
