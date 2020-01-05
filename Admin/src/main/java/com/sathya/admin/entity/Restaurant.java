package com.sathya.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANT")
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "RID", unique=true, nullable=false)
	private String rId;
	
	@Column(name = "PHNO", unique=true, nullable=false)
	private long phno;
	
	@Column(name = "EMAIL", nullable=false)
	private String email;
	
	@Column(name = "LOCID", unique = true, nullable=false)
	private String locid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocid() {
		return locid;
	}

	public void setLocid(String locid) {
		this.locid = locid;
	}	
	
	
	
		




}
