package com.sathya.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.ds.UsersRepository;
import com.sathya.security.entity.Users;
@Service
public class UserServceImpl implements UserService {

	@Autowired
	UsersRepository userRepository;
	
	public Iterable<Users> accessData() {
		// TODO Auto-generated method stub
		return  userRepository.findAll();
	}

	@Transactional
	public Users addData(Users user) {
		// TODO Auto-generated method stub
		return  userRepository.save(user);
	}

	@Transactional
	public Users updateData(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Transactional
	public void deleteDataById(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);

	}

	
	public Users login(String user, String pass) {
		// TODO Auto-generated method stub
		Optional<Users> op=userRepository.findByUsernameAndPassword(user, pass);
		return op.get();
	}

	

}
