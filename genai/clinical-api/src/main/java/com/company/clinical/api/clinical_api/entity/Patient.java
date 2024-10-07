package com.company.clinical.api.clinical_api.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "patient")
@Getter
@Setter
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Country country;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private City city;

    @Column(name = "aadhaar_number", nullable = false, unique = false)
    private String aadhaarNumber;

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="patient_id", referencedColumnName="id")
    private List<ClinicalData> clinical_data;

  
}

// Enum for Country
enum Country {
    INDIA, USA, UK, CANADA, AUSTRALIA,SINGAPORE
    // Add more countries as needed
}

// Enum for City
enum City {
    MUMBAI, DELHI, NEW_YORK, LONDON, TORONTO, SYDNEY,CHENNAI
    // Add more cities as needed
}
