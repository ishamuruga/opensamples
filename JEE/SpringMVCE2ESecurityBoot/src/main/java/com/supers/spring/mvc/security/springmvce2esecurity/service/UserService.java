package com.supers.spring.mvc.security.springmvce2esecurity.service;

import com.supers.spring.mvc.security.springmvce2esecurity.model.User;

public interface UserService {
	void save(User user);

    User findByUsername(String username);
}
