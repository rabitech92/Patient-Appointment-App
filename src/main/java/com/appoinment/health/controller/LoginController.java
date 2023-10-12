package com.appoinment.health.controller;


import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.model.Patient;
import com.appoinment.health.service.PatientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin
public class LoginController {

    private PatientService patientService;

    public LoginController(PatientService patientService) {
        this.patientService = patientService;
    }
    @PostMapping("/login")
    public PatientDto loginpatient(@RequestBody Patient patient){
        return patientService.loginPatient(patient);
    }


}
