package com.sathya.admin.service;

import com.sathya.admin.entity.Restaurant;

public interface RestaurantService {

	public Iterable<Restaurant> SelectAllRestaurant();
	public Restaurant insertRestaurant(Restaurant restaurant);
	public Restaurant updateRestaurant(Restaurant restaurant);
	public void DeleteRestaurant(Integer id);
}
