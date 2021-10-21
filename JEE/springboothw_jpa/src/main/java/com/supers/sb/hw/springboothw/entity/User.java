package com.supers.sb.hw.springboothw.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	@Id
	private String userid;
	
	private String email;
	
	private String password;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable (
			name="tbl_user_role",
			joinColumns = { @JoinColumn(name="user_id") },
			inverseJoinColumns = { @JoinColumn(name="role_id")} 
	)
	private List<Role> roles = new ArrayList<>();
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	

}
