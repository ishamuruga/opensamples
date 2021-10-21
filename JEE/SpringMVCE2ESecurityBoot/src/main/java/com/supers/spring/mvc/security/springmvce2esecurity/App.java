package com.supers.spring.mvc.security.springmvce2esecurity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.supers.spring.mvc.security.springmvce2esecurity.model.Role;
import com.supers.spring.mvc.security.springmvce2esecurity.model.User;
import com.supers.spring.mvc.security.springmvce2esecurity.repository.RoleRepository;
import com.supers.spring.mvc.security.springmvce2esecurity.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class App {



    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

      
    }
}
