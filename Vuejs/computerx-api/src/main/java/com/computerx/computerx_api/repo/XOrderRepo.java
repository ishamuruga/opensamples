package com.computerx.computerx_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.computerx.computerx_api.entity.XOrder;

@Repository
public interface XOrderRepo extends JpaRepository<XOrder, Long> {

}
