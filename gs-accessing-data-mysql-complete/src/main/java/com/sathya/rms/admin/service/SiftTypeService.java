package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.SiftType;

public interface SiftTypeService {

	public Iterable<SiftType> SelectAllSiftType();
	public SiftType insertSiftType(SiftType siftType);
	public SiftType updateSiftType(SiftType siftType);
	public void DeleteSiftType(Integer id);
}
