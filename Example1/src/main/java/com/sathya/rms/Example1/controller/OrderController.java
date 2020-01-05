package com.sathya.rms.Example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.Example1.Entity.Orders;
import com.sathya.rms.Example1.service.OrderService;

@RestController
@RequestMapping(path="/Order")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@GetMapping(path="/getAllOrder")
	public Iterable<Orders> getAllData()
	{
		
		return orderService.SelectAllOrder();
		
	}
	
	
  @PostMapping(path="/newOrder") 
  public Orders addOrder(@RequestBody Orders  orders)
  {
	  return orderService.insertOrder(orders); 
	  
  }
  
  @PutMapping(path="/updateOrder") 
  public Orders updateOrder(@RequestBody Orders  orders)
  {
	  return orderService.updateOrder(orders);
	  
  }
  
  @DeleteMapping(path="/DeleteOrder/{id}") 
  public void  DeleteOrder(@PathVariable("id") Integer id) 
  {
	  orderService.DeleteOrder(id); 
	  
  }
 
  
}
