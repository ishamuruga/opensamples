package com.supers.spring.mvc.security.springmvce2esecurity.service;

public interface SecurityService {
	public String findLoggedInUsername();

	public void autoLogin(String username, String password);
}
