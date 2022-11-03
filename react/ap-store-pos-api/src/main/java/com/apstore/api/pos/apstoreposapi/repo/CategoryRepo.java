package com.apstore.api.pos.apstoreposapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apstore.api.pos.apstoreposapi.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {
    
}
