package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.OrdersRepository;
import com.sathya.rms.admin.entity.Orders;

@Service
public class OrderServiceImp implements OrderService {
	@Autowired
	OrdersRepository ordersRepository;
	
	public Iterable<Orders> SelectAllOrder()
	{
		return ordersRepository.findAll();
		
	}
		  @Transactional 
		  public Orders insertOrder(Orders orders) { 
			  
			  return ordersRepository.save(orders);
			  }
		  
		  @Transactional 
		  public Orders updateOrder(Orders orders) { 
			  return ordersRepository.save(orders); 
			  }
		  
		  @Transactional 
		  public void DeleteOrder(Integer id) {
			  
			  ordersRepository.deleteById(id); 
			  }
	



}
