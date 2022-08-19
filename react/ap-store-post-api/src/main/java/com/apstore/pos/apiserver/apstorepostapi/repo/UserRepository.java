package com.apstore.pos.apiserver.apstorepostapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apstore.pos.apiserver.apstorepostapi.model.DAOUser;

public interface UserRepository extends JpaRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);
}
