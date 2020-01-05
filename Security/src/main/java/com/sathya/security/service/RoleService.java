package com.sathya.security.service;

import java.util.Optional;

import com.sathya.security.entity.Role;

  public interface RoleService {
	 Iterable<Role> accessData();
	 Role addData(Role role);
	 Role updateData(Role role);
	 void deleteDataById(Integer id);
	 Optional<Role> findByRoleName(String s);
}
