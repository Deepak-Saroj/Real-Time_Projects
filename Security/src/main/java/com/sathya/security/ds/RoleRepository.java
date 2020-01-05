package com.sathya.security.ds;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	Optional<Role> findByroleName(String roleName);

}
