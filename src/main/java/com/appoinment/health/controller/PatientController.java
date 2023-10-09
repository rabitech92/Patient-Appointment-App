package com.appoinment.health.controller;

import com.appoinment.health.model.Patient;
import com.appoinment.health.service.impl.PatientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PatientController {

    private PatientServiceImpl patientService;

        @PostMapping("/patient")
    public Patient create(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }
}
