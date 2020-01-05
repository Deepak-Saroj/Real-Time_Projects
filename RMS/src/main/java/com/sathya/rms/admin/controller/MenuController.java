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

import com.sathya.rms.admin.entity.Menu;
import com.sathya.rms.admin.service.MenuService;

@RestController
@RequestMapping(path="/Items")
@CrossOrigin
public class MenuController {
	@Autowired
	MenuService menuService;
	
	@GetMapping(path="/getAllItems")
	public Iterable<Menu> getAllData()
	{
		
		return menuService.SelectAllMenuItems();
		
	}
	
	
  @PostMapping(path="/newItems") 
  public Menu addItems(@RequestBody Menu  menu)
  {
	  return menuService.insertItems(menu); 
	  
  }
  
  @PutMapping(path="/updateItems") 
  public Menu updateItems(@RequestBody Menu  menu)
  {
	  return menuService.updateItems(menu);
	  
  }
  
  @DeleteMapping(path="/DeleteItems/{id}") 
  public void  DeleteItems(@PathVariable("id") Integer id) 
  {
	  menuService.DeleteItems(id); 
	  
  }
 
  
}
