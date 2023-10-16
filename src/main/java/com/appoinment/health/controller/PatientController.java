package com.appoinment.health.controller;

import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.model.Patient;
import com.appoinment.health.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PatientController {

    private static PatientService patientService;


    @PostMapping("/patient")
    public PatientDto create(@RequestBody Patient patient){
        return patientService.createPatient(patient);
    }

    @GetMapping("/getall")
    public List<Patient> getAll(){
        return patientService.getAll();
    }


}
