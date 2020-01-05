package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.Shifts;

public interface ShiftService {

	public Iterable<Shifts> SelectAllShift();
	public Shifts insertShift(Shifts Shift);
	public Shifts updateShift(Shifts Shift);
	public void DeleteShift(Integer id);
}
