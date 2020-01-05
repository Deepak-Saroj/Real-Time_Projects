package com.sathya.security.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.ds.PermissionRepository;
import com.sathya.security.entity.Permission;

@Service
public class PermissionServceImpl implements PermissionService {

	@Autowired
	PermissionRepository permissionRepository;
	
	public Iterable<Permission> accessData() {
		// TODO Auto-generated method stub
		return  permissionRepository.findAll();
	}

	@Transactional
	public Permission addData(Permission permission) {
		// TODO Auto-generated method stub
		return  permissionRepository.save(permission);
	}

	@Transactional
	public Permission updateData(Permission permission) {
		// TODO Auto-generated method stub
		return permissionRepository.save(permission);
	}

	@Transactional
	public void deleteDataById(Integer id) {
		// TODO Auto-generated method stub
		permissionRepository.deleteById(id);

	}

}
