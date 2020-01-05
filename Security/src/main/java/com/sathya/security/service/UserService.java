package com.sathya.security.service;

import com.sathya.security.entity.Users;

public interface UserService {
	public Iterable<Users> accessData();
	public Users addData(Users user);
	public Users updateData(Users user);
	public void deleteDataById(Integer id);

}
