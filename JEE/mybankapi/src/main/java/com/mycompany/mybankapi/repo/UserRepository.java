package com.mycompany.mybankapi.repo;

import com.mycompany.mybankapi.model.DAOUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DAOUser,Long>{
    DAOUser findByUsername(String username);
}
