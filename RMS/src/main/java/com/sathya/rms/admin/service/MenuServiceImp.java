package com.sathya.rms.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.MenuRepository;
import com.sathya.rms.admin.entity.Menu;

@Service
public class MenuServiceImp implements MenuService {
	@Autowired
	MenuRepository menuRepository;
	
	public Iterable<Menu> SelectAllMenuItems()
	{
		return menuRepository.findAll();
		
	}
		  @Transactional 
		  public Menu insertItems(Menu menu) { 
			  
			  return menuRepository.save(menu);
			  }
		  
		  @Transactional 
		  public Menu updateItems(Menu menu) { 
			  return menuRepository.save(menu); 
			  }
		  
		  @Transactional 
		  public void DeleteItems(Integer id) {
			  
			  menuRepository.deleteById(id); 
			  }
	



}
