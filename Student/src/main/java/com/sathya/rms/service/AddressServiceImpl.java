package com.sathya.rms.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.AddressRepository;
import com.sathya.rms.entity.Address;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository adderrepo;

	@Transactional
	public void saveData(Address address) {
		// TODO Auto-generated method stub
		  adderrepo.save(address);
	}

	

}
