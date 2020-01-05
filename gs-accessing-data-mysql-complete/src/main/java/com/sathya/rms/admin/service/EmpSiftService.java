package com.sathya.rms.admin.service;

import com.sathya.rms.admin.entity.EmpSift;

public interface EmpSiftService {

	public Iterable<EmpSift> SelectAllEmpSift();
	public EmpSift insertEmpSift(EmpSift empSift);
	public EmpSift updateEmpSift(EmpSift empSift);
	public void DeleteEmpSift(Integer id);
}
