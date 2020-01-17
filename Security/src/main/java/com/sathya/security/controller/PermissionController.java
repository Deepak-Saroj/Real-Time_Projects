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

import com.sathya.security.entity.Permission;
import com.sathya.security.service.PermissionService;

@RestController
@RequestMapping(path="/permission")
@CrossOrigin
public class PermissionController {
	@Autowired
	PermissionService permissionSevice;
	
	@GetMapping(path="/accessingData")
	public Iterable<Permission> gettingAllRecord()
	{
		return permissionSevice.accessData();
	}
	
	@PostMapping(path="/insertingData")
	public Permission addingRecord(@RequestBody final Permission permission)
	{
		return permissionSevice.addData(permission);
	}
	
	@PutMapping(path="/updatingData")
	public Permission updatingRecord(@RequestBody final Permission permission)
	{
		return permissionSevice.updateData(permission);
	}
	
	@DeleteMapping(path="/deleteingDatabyId/{id}")
	public void deletingRecordById(@PathVariable("id") final Integer id)
	{
		 permissionSevice.deleteDataById(id);
	}

}
