package com.sathya.rms.Example1.service;

import com.sathya.rms.Example1.Entity.Orders;

public interface OrderService {

	public Iterable<Orders> SelectAllOrder();
	public Orders insertOrder(Orders orders);
	public Orders updateOrder(Orders orders);
	public void DeleteOrder(Integer id);
}
