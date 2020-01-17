package com.sathya.security.ds;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

	 Optional<Users> findByUsernameAndPassword(String user,String pass);

}
