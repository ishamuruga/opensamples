package com.supers.spring.mvc.security.springmvce2esecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supers.spring.mvc.security.springmvce2esecurity.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
