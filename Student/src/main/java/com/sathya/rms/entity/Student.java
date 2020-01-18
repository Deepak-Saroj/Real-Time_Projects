package com.sathya.rms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Student1")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID")
	private int id;
	@Column(name ="STID")
	private int stid;
	@Column(name ="NAME", nullable = false)
	private String name;
	
	@Transient
	private Address address;

	@OneToMany(mappedBy="student" ,cascade = CascadeType.ALL)
	List<Address> address1;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public int getAdd_id() { return add_id; }
	 * 
	 * public void setAdd_id(int add_id) { this.add_id = add_id; }
	 */
	
	
	

}
