package com.sathya.rms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ST_ID")
	private int id;
	@Column(name ="NAME", nullable = false)
	private String name;
	

	/*
	 * @Column(name ="ADD_ID", unique=true, nullable = false) private int add_id;
	 */
	@OneToMany(mappedBy="student")
	List<Address> address;
	
	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
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
