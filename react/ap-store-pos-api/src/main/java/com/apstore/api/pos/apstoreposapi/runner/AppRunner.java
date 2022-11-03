package com.apstore.api.pos.apstoreposapi.runner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.apstore.api.pos.apstoreposapi.model.Category;
import com.apstore.api.pos.apstoreposapi.model.EnmRole;
import com.apstore.api.pos.apstoreposapi.model.Role;
import com.apstore.api.pos.apstoreposapi.model.User;
import com.apstore.api.pos.apstoreposapi.repo.RoleRepository;
import com.apstore.api.pos.apstoreposapi.repo.UserRepository;
import com.apstore.api.pos.apstoreposapi.service.CategoryManager;

@Component
@Transactional
public class AppRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private CategoryManager cateService;

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

        List<Category> cates = new ArrayList<>();
        Category cate1 = new Category();
        cate1.setName("Fruits");

        Category cate5 = new Category();
        cate5.setName("Groceries");

        Category cate2 = new Category();
        cate2.setName("Oils");

        Category cate3 = new Category();
        cate3.setName("Snackes");

        Category cate4 = new Category();
        cate4.setName("Groceries");

        cates.add(cate1);
        cates.add(cate2);
        cates.add(cate3);
        cates.add(cate4);
        cates.add(cate5);

        cateService.save(cate1);
        cateService.save(cate2);
        cateService.save(cate3);
        cateService.save(cate4);
        cateService.save(cate5);
        

        System.out.println("Completed..........................");

    }
    
}
