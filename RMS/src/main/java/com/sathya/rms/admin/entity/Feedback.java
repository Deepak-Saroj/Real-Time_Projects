package com.sathya.rms.admin.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="FEEDBACK")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	@Column(name="UID",nullable = false,unique = true)
	private String uid;
	@Column(name="FB")
	private String fb;
	@Column(name="Date_",nullable = false)
	private Date date;
}
