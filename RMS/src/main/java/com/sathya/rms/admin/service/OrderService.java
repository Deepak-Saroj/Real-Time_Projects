package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Orders;

public interface OrderService {

	public Iterable<Orders> SelectAllOrder();
	public Orders insertOrder(Orders orders);
	public Orders updateOrder(Orders orders);
	public void DeleteOrder(Integer id);
}
