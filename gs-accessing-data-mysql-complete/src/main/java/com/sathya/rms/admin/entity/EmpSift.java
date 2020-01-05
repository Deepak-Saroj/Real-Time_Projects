package com.sathya.rms.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import oracle.sql.DATE;

@Entity
@Table(name="EMPSIFT")
public class EmpSift {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "EID", unique=true, nullable=false)
	private String eId;
	
	@Column(name = "STYPE")
	private String sType;
	
	@Column(name = "CURRENT_DATE",nullable=false)
	private DATE date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getsType() {
		return sType;
	}

	public void setsType(String sType) {
		this.sType = sType;
	}

	public DATE getDate() {
		return date;
	}

	public void setDate(DATE date) {
		this.date = date;
	}

	

}
