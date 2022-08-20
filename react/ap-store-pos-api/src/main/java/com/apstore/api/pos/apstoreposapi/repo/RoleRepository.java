package com.apstore.api.pos.apstoreposapi.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apstore.api.pos.apstoreposapi.model.EnmRole;
import com.apstore.api.pos.apstoreposapi.model.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(EnmRole name);
}
