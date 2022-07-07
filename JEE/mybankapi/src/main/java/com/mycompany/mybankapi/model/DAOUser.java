package com.mycompany.mybankapi.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user")
public class DAOUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String username;
	@Column
	private String password;   
	
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_with_role",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}, 
            		uniqueConstraints = @UniqueConstraint(columnNames = {
                            "user_id", "role_id" }))
    private List<Role> roles;
	
    
	/*
	 * @JoinTable(name = "prod_colour", joinColumns = {
	 * 
	 * @JoinColumn(name = "prod_id", referencedColumnName = "prod_id")},
	 * inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "colour_id", referencedColumnName = "colour_id")},
	 * uniqueConstraints = @UniqueConstraint(columnNames = { "colour_id", "prod_id"
	 * })) //@OneToMany(cascade = CascadeType.ALL,fetch =
	 * FetchType.EAGER,orphanRemoval = true)
	 */	//@JoinColumn(name = "userid")
	//private List<Role> roles;


	//@Column
	//private String role;

	//public String getRole() {
	//	return role;
	//}

	//public void setRole(String role) {
	//	this.role = role;
	//}

	public String getUsername() {
		return username;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public List<Role> getRoles() { return roles; }
	 * 
	 * public void setRoles(List<Role> roles) { this.roles = roles; }
	 */
}
