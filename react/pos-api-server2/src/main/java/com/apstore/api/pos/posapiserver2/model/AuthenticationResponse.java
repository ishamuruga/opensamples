package com.apstore.api.pos.posapiserver2.model;

public class AuthenticationResponse {
	private String token;

	private String[] roles;
	
	public AuthenticationResponse() {}

	public AuthenticationResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}
}
