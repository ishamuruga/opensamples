package com.supers.sb.hw.springboothw.repo;

import com.supers.sb.hw.springboothw.entity.Zoo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZooRepo  extends JpaRepository<Zoo,Integer>{
    
}
