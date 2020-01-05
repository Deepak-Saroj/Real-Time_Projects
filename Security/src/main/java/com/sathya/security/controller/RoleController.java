package com.sathya.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entity.Role;
import com.sathya.security.service.RoleService;

@RestController
@RequestMapping(path="/role")
public class RoleController {
	@Autowired
	RoleService roleSevice;
	
	@GetMapping(path="/accessingData")
	public Iterable<Role> gettingAllRecord()
	{
		return roleSevice.accessData();
	}
	
	@PostMapping(path="/insertingData")
	public Role addingRecord(@RequestBody Role role)
	{
		return roleSevice.addData(role);
	}
	
	@PutMapping(path="/updatingData")
	public Role updatingRecord(@RequestBody Role role)
	{
		return roleSevice.updateData(role);
	}
	
	@DeleteMapping(path="/deleteingDatabyId/{id}")
	public void deletingRecordById(@PathVariable("id") Integer id)
	{
		 roleSevice.deleteDataById(id);
	}

}
