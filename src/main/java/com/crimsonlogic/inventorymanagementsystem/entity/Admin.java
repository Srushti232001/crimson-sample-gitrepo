package com.crimsonlogic.inventorymanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admindetails")
public class Admin {
	
	@Id
	@Column(name="adminid")
	private  int adminId;
	
	@Column(name="adminname")
	private String adminName;
	
	@Column(name="adminemail")
	private String adminEmail;
	
	@Column(name="adminusername")
	private String adminUserName;
	
	@Column(name="adminpassword")
	private String adminPassword;

	public Admin() {
		super();
	}

	public Admin(int adminId, String adminName, String adminEmail, String adminUserName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminUserName=" + adminUserName + ", adminPassword=" + adminPassword + "]";
	}
	
	

}
