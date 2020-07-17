package com.cg.bookStore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="bk_admin")
@DynamicUpdate
@DynamicInsert
public class Admin {

	@Id
	@Column(name="admin_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="adminIdGenerator")
	@SequenceGenerator(name="adminIdGenerator", initialValue=100)
	private int adminId;
	
	
	@Column(name="email")
	@Size(min=10, max=64)
	private String email;
	
	@Column(name="fullName")
	@Size(min=8, max= 16)
	private String fullName;
	
	@Column(name="password")
	@Size(min=8, max= 16)
	private String password;
	
	
	public Admin() {}

	public Admin(int adminId, @Size(min = 10, max = 64) String email, @Size(min = 8, max = 16) String fullName,
			@Size(min = 8, max = 16) String password) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}