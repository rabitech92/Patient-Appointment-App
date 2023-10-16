package com.appoinment.health.controller;


import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.model.Patient;
import com.appoinment.health.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
@RequiredArgsConstructor
public class LoginController {

    private static PatientService patientService;


    @PostMapping("/login")
    public PatientDto loginpatient(@RequestBody Patient patient){
        return patientService.loginPatient(patient);
    }


}
