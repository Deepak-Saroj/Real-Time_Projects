package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.RestDining;

public interface RestDiningService {

	public Iterable<RestDining> SelectAllRestDining();
	public RestDining insertRestDining(RestDining restDining);
	public RestDining updateRestDining(RestDining restDining);
	public void DeleteRestDining(Integer id);
}
