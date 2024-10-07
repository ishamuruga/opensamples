package com.company.clinical.api.clinical_api.repo;


//Generate Physician JPA Repository class that uses Physician Class
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.clinical.api.clinical_api.entity.Physician;

@Repository
public interface PhysicianRepository extends JpaRepository<Physician, Long> {
    //create method findByDoctorNameContainingIgnoreCase that access name as input parameter
    public Iterable<Physician> findByDoctorNameContainingIgnoreCase(String name);

}