package com.sathya.rms.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Menu")
public class Menu implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "MANUID", unique=true, nullable=false)
	private String manuId;
	
	@Column(name = "ITEMS", unique=true, nullable=false)
	private String items;
	@Column(name = "FULLPRICE",  nullable=false)
	private int fullPrice;
	@Column(name = "HALFPRICE",nullable=false)
	private int halfPrice;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManuId() {
		return manuId;
	}
	public void setManuId(String manuId) {
		this.manuId = manuId;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getFullPrice() {
		return fullPrice;
	}
	public void setFullPrice(int fullPrice) {
		this.fullPrice = fullPrice;
	}
	public int getHalfPrice() {
		return halfPrice;
	}
	public void setHalfPrice(int halfPrice) {
		this.halfPrice = halfPrice;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", manuId=" + manuId + ", items=" + items + ", fullPrice=" + fullPrice
				+ ", halfPrice=" + halfPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fullPrice;
		result = prime * result + halfPrice;
		result = prime * result + id;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((manuId == null) ? 0 : manuId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (fullPrice != other.fullPrice)
			return false;
		if (halfPrice != other.halfPrice)
			return false;
		if (id != other.id)
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (manuId == null) {
			if (other.manuId != null)
				return false;
		} else if (!manuId.equals(other.manuId))
			return false;
		return true;
	}
	
	
	
	
	}
