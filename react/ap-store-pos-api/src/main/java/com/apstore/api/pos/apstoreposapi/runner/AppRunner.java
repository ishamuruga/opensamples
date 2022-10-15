package com.apstore.api.pos.apstoreposapi.runner;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.apstore.api.pos.apstoreposapi.model.EnmRole;
import com.apstore.api.pos.apstoreposapi.model.Role;
import com.apstore.api.pos.apstoreposapi.model.User;
import com.apstore.api.pos.apstoreposapi.repo.RoleRepository;
import com.apstore.api.pos.apstoreposapi.repo.UserRepository;

@Component
@Transactional
public class AppRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public void run(String... args) throws Exception {
        Role roleU = new Role();
        roleU.setName(EnmRole.ROLE_USER);

        Role roleA = new Role();
        roleA.setName(EnmRole.ROLE_ADMIN);

        Set uRole = new HashSet();
        uRole.add(roleU);

        Set aRole = new HashSet();
        aRole.add(roleA);

        Set allRole = new HashSet();
        allRole.add(roleU);
        allRole.add(roleA);


        roleRepo.save(roleU);
        roleRepo.save(roleA);

        User userU = new User();
        userU.setEmail("ramarajan@gmail.com");
        userU.setPassword(encoder.encode("ramarajan"));
        userU.setUsername("ramarajan@gmail.com");
        userU.setRoles(uRole);

        User userA = new User();
        userA.setEmail("goundamani@gmail.com");
        userA.setPassword(encoder.encode("goundamani"));
        userA.setUsername("goundamani");
        userA.setRoles(aRole);

        User userAll = new User();
        userAll.setEmail("shanmugasundaram@gmail.com");
        userAll.setPassword(encoder.encode("shanmugasundaram"));
        userAll.setUsername("shanmugasundaram");
        userAll.setRoles(allRole);

        // User userU1 = new User();
        // userU1.setEmail("ramarajan@gmail.com");
        // userU1.setPassword(encoder.encode("ramarajan"));
        // userU1.setUsername("ramarajan@gmail.com");
        // userU1.setRoles(uRole);

        userRepo.save(userU);
        userRepo.save(userA);
        userRepo.save(userAll);
        // userRepo.save(userU1);

        System.out.println("Completed..........................");

    }
    
}
