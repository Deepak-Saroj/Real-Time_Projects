package com.sathya.rms.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.rms.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
