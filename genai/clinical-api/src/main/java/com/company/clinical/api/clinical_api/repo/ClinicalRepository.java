package com.company.clinical.api.clinical_api.repo;


////Generate ClinicalRepository JPA Repository class that uses ClinicalData Class
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.clinical.api.clinical_api.entity.ClinicalData;

@Repository
public interface ClinicalRepository extends JpaRepository<ClinicalData, Long> {
    
}