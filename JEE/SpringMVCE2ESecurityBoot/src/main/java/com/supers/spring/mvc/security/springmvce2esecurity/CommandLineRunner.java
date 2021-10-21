package com.supers.spring.mvc.security.springmvce2esecurity;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import com.supers.spring.mvc.security.springmvce2esecurity.model.Role;
import com.supers.spring.mvc.security.springmvce2esecurity.model.User;
import com.supers.spring.mvc.security.springmvce2esecurity.repository.RoleRepository;
import com.supers.spring.mvc.security.springmvce2esecurity.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    @Autowired
    private UserRepository uRepo;

    @Autowired
	private RoleRepository rRepo;
	
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void run(String... args) throws Exception {

		Role role1 = new Role();
        role1.setName("ROLE_ADMIN");

        Role role2 = new Role();
        role2.setName("ROLE_USER");
        
        Set<Role> roles = new HashSet<>();
        roles.add(role1);
        roles.add(role2);
        
		User user = new User();
        user.setUsername("supers");
        user.setPassword("$2a$10$EF1yWlGUnFqa1QkA3pJzHueJpWmkWbfRIGMvWAJ5pFFiBvGD8ffdC");
        user.setPasswordConfirm("$2a$10$EF1yWlGUnFqa1QkA3pJzHueJpWmkWbfRIGMvWAJ5pFFiBvGD8ffdC");
        user.setRoles(roles);

		uRepo.save(user);

		Set<Role> roles1 = new HashSet<>();
        roles1.add(role2);
		
		User user1 = new User();
        user1.setUsername("supers1");
        user1.setPassword("$2a$10$EF1yWlGUnFqa1QkA3pJzHueJpWmkWbfRIGMvWAJ5pFFiBvGD8ffdC");
        user1.setPasswordConfirm("$2a$10$EF1yWlGUnFqa1QkA3pJzHueJpWmkWbfRIGMvWAJ5pFFiBvGD8ffdC");
		user1.setRoles(roles1);
		
		uRepo.save(user1);

		System.out.println("Completed");
	}

}
