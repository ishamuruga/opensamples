package com.company.clinical.api.clinical_api.dtos;

import java.time.LocalDateTime;

import com.company.clinical.api.clinical_api.entity.ClinicalData;
import com.company.clinical.api.clinical_api.entity.Patient;
import com.company.clinical.api.clinical_api.entity.ClinicalData.ComponentName;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClinicalDataRequest {
    private ClinicalData clinicalData;

    private Long patientId;
}
