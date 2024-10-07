package com.company.clinical.api.clinical_api.repo;

//Generate Patient JPA Repository class that uses Patietn Class
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.clinical.api.clinical_api.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}