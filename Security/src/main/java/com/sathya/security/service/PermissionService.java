package com.sathya.security.service;

import com.sathya.security.entity.Permission;

public interface PermissionService {
	public Iterable<Permission> accessData();
	public Permission addData(Permission permission);
	public Permission updateData(Permission permission);
	public void deleteDataById(Integer id);

}
