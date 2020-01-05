package com.sathya.admin.service;

import com.sathya.admin.entity.Designation;

public interface DesignationService {

	public Iterable<Designation> SelectAllDesignation();
	public Designation insertDesignation(Designation designation);
	public Designation updateDesignation(Designation designation);
	public void DeleteDesignation(Integer id);
}
