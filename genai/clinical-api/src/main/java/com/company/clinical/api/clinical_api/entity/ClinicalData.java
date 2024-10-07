package com.company.clinical.api.clinical_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "clinical_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "component_name", nullable = false)
    private ComponentName componentName;

    @Column(name = "component_value", nullable = false)
    private String componentValue;

    @Column(name = "measure_datetime", nullable = false)
    private LocalDateTime measureDateTime;

    @CreationTimestamp
    private Timestamp createdTS;

    // Enum for ComponentName
    public enum ComponentName {
        BLOOD_PRESSURE,
        HEART_RATE,
        TEMPERATURE,
        OXYGEN_SATURATION,
        RESPIRATORY_RATE,
        // Add more components as needed
    }
}

