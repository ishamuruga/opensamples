package com.company.clinical.api.clinical_api.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.company.clinical.api.clinical_api.dtos.ClinicalDataRequest;
import com.company.clinical.api.clinical_api.entity.ClinicalData;
import com.company.clinical.api.clinical_api.entity.Patient;
import com.company.clinical.api.clinical_api.repo.ClinicalRepository;
import com.company.clinical.api.clinical_api.repo.PatientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clinical-data")
public class ClinicalDataController {

    @Autowired
    private ClinicalRepository clinicalRepository;

    @Autowired
    private PatientRepository patienrRepository;

    // @Autowired
    // public ClinicalDataController(ClinicalRepository clinicalRepository,PatientRepository patienrRepository) {
    //     this.clinicalRepository = clinicalRepository;
    //     this.patienrRepository = patienrRepository;
    // }

    // Create new clinical data
    @PostMapping
    public ResponseEntity<ClinicalData> createClinicalData(@RequestBody ClinicalData clinicalData) {
        ClinicalData savedData = clinicalRepository.save(clinicalData);
        return new ResponseEntity<>(savedData, HttpStatus.CREATED);
    }

    // Retrieve all clinical data
    @GetMapping
    public ResponseEntity<List<ClinicalData>> getAllClinicalData() {
        List<ClinicalData> allData = clinicalRepository.findAll();
        return new ResponseEntity<>(allData, HttpStatus.OK);
    }

    // Retrieve clinical data by ID
        // Optional<ClinicalData> data = clinicalRepository.findById(id);
        // return data.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
        //         .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    //}

    // Update clinical data
    @PutMapping("/{id}")
    public ResponseEntity<ClinicalData> updateClinicalData(@PathVariable Long id, @RequestBody ClinicalData clinicalDataDetails) {
        Optional<ClinicalData> optionalData = clinicalRepository.findById(id);
        if (optionalData.isPresent()) {
            ClinicalData existingData = optionalData.get();
            existingData.setComponentName(clinicalDataDetails.getComponentName());
            existingData.setComponentValue(clinicalDataDetails.getComponentValue());
            existingData.setMeasureDateTime(clinicalDataDetails.getMeasureDateTime());
            // Set other fields as necessary

            ClinicalData updatedData = clinicalRepository.save(existingData);
            return new ResponseEntity<>(updatedData, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete clinical data
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClinicalData(@PathVariable Long id) {
        Optional<ClinicalData> data = clinicalRepository.findById(id);
        if (data.isPresent()) {
            clinicalRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/clinicals")
    public ResponseEntity<Patient> createClinicalData(@RequestBody ClinicalDataRequest clinicalData) {

        List lst = new ArrayList();
    

        lst.add(clinicalData.getClinicalData());

        // Patient newPatient = clinicalData.getPatient().;
        // newPatient.setClinical_data(lst);
        
        Patient currPatient = patienrRepository.findById(clinicalData.getPatientId()).get();
        currPatient.setClinical_data(lst);

      
        patienrRepository.save(currPatient);

        return new ResponseEntity<>(currPatient,HttpStatus.CREATED);
    }
    

//     // Delete clinical data
// (@PathVariable Long id) {
//         Optional<ClinicalData> data = clinicalRepository.findById(id);
//         if (data.isPresent()) {
//             clinicalRepository.deleteById(id);
//             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//         } else {
//             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//         }
//     }

//     // Search clinical data by component name
// (@RequestParam String componentName) {
//         return new ResponseEntity<>(data, HttpStatus.OK);
//     }




}
