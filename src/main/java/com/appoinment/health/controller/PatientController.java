package com.appoinment.health.controller;

import com.appoinment.health.model.Patient;
import com.appoinment.health.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patient")
    public Patient create(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @GetMapping("/getall")
    public List<Patient> getAll(){
        return patientService.getAll();
    }


}
