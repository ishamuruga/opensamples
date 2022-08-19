package com.apstore.api.pos.posapiserver2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apstore.api.pos.posapiserver2.model.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>  {

}
