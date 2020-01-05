package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Menu;

public interface MenuService {

	public Iterable<Menu> SelectAllMenuItems();
	public Menu insertItems(Menu menu);
	public Menu updateItems(Menu menu);
	public void DeleteItems(Integer id);
}
