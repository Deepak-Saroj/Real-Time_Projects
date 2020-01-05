package com.sathya.rms.Example1.service;

import com.sathya.rms.Example1.Entity.Menu;

public interface MenuService {

	public Iterable<Menu> SelectAllMenuItems();
	public Menu insertItems(Menu menu);
	public Menu updateItems(Menu menu);
	public void DeleteItems(Integer id);
}
