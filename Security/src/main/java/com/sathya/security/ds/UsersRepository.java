package com.sathya.security.ds;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
