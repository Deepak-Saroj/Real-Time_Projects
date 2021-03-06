package com.sathya.rms.admin.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Menu")
public class Menu implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "RID", unique=true, nullable=false)
	private String rid;
	@Column(name = "RID", unique=true, nullable=false)
	private String iid;
	@Column(name = "RID", unique=true, nullable=false)
	private Date date;
	
}