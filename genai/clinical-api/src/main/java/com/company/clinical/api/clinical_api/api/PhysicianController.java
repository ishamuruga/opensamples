package com.company.clinical.api.clinical_api.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.company.clinical.api.clinical_api.entity.Physician;
import com.company.clinical.api.clinical_api.repo.PhysicianRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/physicians")
public class PhysicianController {

    private final PhysicianRepository physicianRepository;

    @Autowired
    public PhysicianController(PhysicianRepository physicianRepository) {
        this.physicianRepository = physicianRepository;
    }

    // Create a new physician
    @PostMapping
    public ResponseEntity<Physician> createPhysician(@RequestBody Physician physician) {
        Physician savedPhysician = physicianRepository.save(physician);
        return new ResponseEntity<>(savedPhysician, HttpStatus.CREATED);
    }

    // Retrieve all physicians
    @GetMapping
    public ResponseEntity<List<Physician>> getAllPhysicians() {
        List<Physician> physicians = physicianRepository.findAll();
        return new ResponseEntity<>(physicians, HttpStatus.OK);
    }

    // Retrieve a single physician by ID
    @GetMapping("/{id}")
    public ResponseEntity<Physician> getPhysicianById(@PathVariable Long id) {
        Optional<Physician> physician = physicianRepository.findById(id);
        return physician.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update a physician
    @PutMapping("/{id}")
    public ResponseEntity<Physician> updatePhysician(@PathVariable Long id, @RequestBody Physician physicianDetails) {
        Optional<Physician> optionalPhysician = physicianRepository.findById(id);
        if (optionalPhysician.isPresent()) {
            Physician existingPhysician = optionalPhysician.get();
            existingPhysician.setDoctorName(physicianDetails.getDoctorName());
            existingPhysician.setSpeciality(physicianDetails.getSpeciality());
            existingPhysician.setRegistrationDate(physicianDetails.getRegistrationDate());
            
            Physician updatedPhysician = physicianRepository.save(existingPhysician);
            return new ResponseEntity<>(updatedPhysician, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a physician
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletePhysician(@PathVariable Long id) {
        Optional<Physician> physician = physicianRepository.findById(id);
        if (physician.isPresent()) {
            physicianRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Search physicians by name
    @GetMapping("/search")
    public ResponseEntity<List<Physician>> searchPhysiciansByName(@RequestParam String name) {
        List<Physician> physicians = (List<Physician>) physicianRepository.findByDoctorNameContainingIgnoreCase(name);
        return new ResponseEntity<>(physicians, HttpStatus.OK);
    }

    // Search physicians by speciality

//     // Search physicians by name
// (@RequestParam String name) {
//         List<Physician> physicians = physicianRepository.findByDoctorNameContainingIgnoreCase(name);
//         return new ResponseEntity<>(physicians, HttpStatus.OK);
//     }

//     // Search physicians by speciality
// (@RequestParam String speciality) {
//         List<Physician> physicians = physicianRepository.findBySpecialityContainingIgnoreCase(speciality);
//         return new ResponseEntity<>(physicians, HttpStatus.OK);
    // }
}
