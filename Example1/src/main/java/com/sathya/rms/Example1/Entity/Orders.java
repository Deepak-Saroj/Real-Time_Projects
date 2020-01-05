package com.sathya.rms.Example1.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ORDERS")
public class Orders implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "ORDERNO")
	private String orderNo;
	
	@Column(name = "TABLENO",nullable=false)
	private Date tableNo;
	
	@Column(name = "DILIVARYTIME",nullable=false)
	private Date DlTime;
	@Transient
	private int menuId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getTableNo() {
		return tableNo;
	}
	public void setTableNo(Date tableNo) {
		this.tableNo = tableNo;
	}
	public Date getDlTime() {
		return DlTime;
	}
	public void setDlTime(Date dlTime) {
		DlTime = dlTime;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", orderNo=" + orderNo + ", tableNo=" + tableNo + ", DlTime=" + DlTime + ", menuId="
				+ menuId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DlTime == null) ? 0 : DlTime.hashCode());
		result = prime * result + id;
		result = prime * result + menuId;
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((tableNo == null) ? 0 : tableNo.hashCode());
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
		Orders other = (Orders) obj;
		if (DlTime == null) {
			if (other.DlTime != null)
				return false;
		} else if (!DlTime.equals(other.DlTime))
			return false;
		if (id != other.id)
			return false;
		if (menuId != other.menuId)
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (tableNo == null) {
			if (other.tableNo != null)
				return false;
		} else if (!tableNo.equals(other.tableNo))
			return false;
		return true;
	}
	
	

}
