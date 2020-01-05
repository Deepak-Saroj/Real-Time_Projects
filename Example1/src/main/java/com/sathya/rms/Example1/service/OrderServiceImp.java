package com.sathya.rms.Example1.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.Example1.Entity.Orders;
import com.sathya.rms.Example1.data.OrdersRepository;

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
