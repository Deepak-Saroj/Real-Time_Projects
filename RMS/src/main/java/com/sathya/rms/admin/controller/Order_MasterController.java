package com.sathya.rms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.admin.entity.Order_Master;
import com.sathya.rms.admin.service.OrderService;
import com.sathya.rms.admin.service.Order_MasterService;

@RestController
@RequestMapping(path="/Order_Master")
@CrossOrigin
public class Order_MasterController {
	@Autowired
	Order_MasterService oms;
	@Autowired
	OrderService os;
	
	@GetMapping(path="/selectAllRecord")
	public Iterable<Order_Master> selectRecord()
	{
		return oms.selectAllRecord();
	}
	@GetMapping(path="/selectById")
	public Order_Master selectById(@RequestBody Order_Master om)
	{
		return oms.selectByOmid(om.getOmid());
	}
	
	@PostMapping(path="/insertRecord")
	public Order_Master insertRecord(@RequestBody Order_Master om)
	{
		os.insertOrder(om.getOrders());
		return oms.insertRecord(om);
	}
	@PutMapping(path="/updateRecord")
	public Order_Master updateRecord(@RequestBody Order_Master om)
	{
		return oms.updateRecord(om);
	}
	@DeleteMapping(path="/deleteRecord/{omid}")
	public boolean deleteRecord(@PathVariable ("omid") String omid)
	{
		Order_Master om=oms.deleteByOmid(omid);
		boolean result=false;
		if(om!=null)
			result= true;
		return result;
	}
	
}
