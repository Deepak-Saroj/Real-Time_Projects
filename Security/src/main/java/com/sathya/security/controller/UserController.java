package com.sathya.security.controller;

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

import com.sathya.security.entity.Users;
import com.sathya.security.service.UserService;

@RestController
@RequestMapping(path="/users")
@CrossOrigin
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping(path="/accessingData")
	public Iterable<Users> gettingAllRecord()
	{
		return userService.accessData();
	}
	
	@PostMapping(path="/insertingData")
	public Users addingRecord(@RequestBody Users user)
	{
		return userService.addData(user);
	}
	
	@PutMapping(path="/updatingData")
	public Users updatingRecord(@RequestBody Users user)
	{
		return userService.updateData(user);
	}
	
	@DeleteMapping(path="/deleteingDatabyId/{id}")
	public void deletingRecordById(@PathVariable("id") Integer id)
	{
		 userService.deleteDataById(id);
	}
	@PostMapping(path="/login")
	public Users login(@RequestBody Users user)
	{
		return userService.login(user.getUsername(), user.getPassword());
	}
}
