package com.sathya.security.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="PERMISSION")
public class Permission implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PERMISSIONID")
	private int permissionid;
	
	@Column(name="PERMISSIONNAME", nullable=false)
	private String permissionName;
	
	@Column(name="PERMISSIONDISCRIPTION",nullable=false)
	private String permissiondiscription;
	
	@Transient
	private int roleid;
	
	@ManyToOne
	@JoinColumn(name="ROLE_ID")
	private Role role;

	public int getPermissionid() {
		return permissionid;
	}

	public void setPermissionid(int permissionid) {
		this.permissionid = permissionid;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissiondiscription() {
		return permissiondiscription;
	}

	public void setPermissiondiscription(String permissiondiscription) {
		this.permissiondiscription = permissiondiscription;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Permission [permissionid=" + permissionid + ", permissionName=" + permissionName
				+ ", permissiondiscription=" + permissiondiscription + ", roleid=" + roleid + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((permissionName == null) ? 0 : permissionName.hashCode());
		result = prime * result + ((permissiondiscription == null) ? 0 : permissiondiscription.hashCode());
		result = prime * result + permissionid;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + roleid;
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
		Permission other = (Permission) obj;
		if (permissionName == null) {
			if (other.permissionName != null)
				return false;
		} else if (!permissionName.equals(other.permissionName))
			return false;
		if (permissiondiscription == null) {
			if (other.permissiondiscription != null)
				return false;
		} else if (!permissiondiscription.equals(other.permissiondiscription))
			return false;
		if (permissionid != other.permissionid)
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (roleid != other.roleid)
			return false;
		return true;
	}
	
	

}
