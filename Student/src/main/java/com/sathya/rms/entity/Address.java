package com.sathya.rms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO/*SEQUENCE, generator="Adder_seq")
	@SequenceGenerator(
			name="Adder_seq",
			sequenceName = "course_sequence"
											 * , allocationSize=00
											 */
		)
	@Column(name ="ID")
	private int id;

	@Column(name = "CITY", nullable = false)
	private String city;

	@Column(name = "COUNTRY", nullable = false)
	private String country;

	/*
	 * @Column(name ="ADD_ID",unique = true,nullable = false) private int add_id;
	 */

	@ManyToOne
	@JoinColumn(name = "ST_ID")
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
