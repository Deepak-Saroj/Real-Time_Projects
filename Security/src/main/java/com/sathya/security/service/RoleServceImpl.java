package com.sathya.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.ds.RoleRepository;
import com.sathya.security.entity.Role;
@Service
public class RoleServceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	public Iterable<Role> accessData() {
		// TODO Auto-generated method stub
		return  roleRepository.findAll();
	}

	@Transactional
	public Role addData(Role role) {
		// TODO Auto-generated method stub
		return  roleRepository.save(role);
	}

	@Transactional
	public Role updateData(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

	@Transactional
	public void deleteDataById(Integer id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);

	}

	@Transactional
	public Optional<Role> findByRoleName(String s) {
		// TODO Auto-generated method stub
		return roleRepository.findByroleName(s);
	}

}
