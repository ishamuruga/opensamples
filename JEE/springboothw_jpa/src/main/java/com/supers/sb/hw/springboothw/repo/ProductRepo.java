package com.supers.sb.hw.springboothw.repo;

import com.supers.sb.hw.springboothw.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
