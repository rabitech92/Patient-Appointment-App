package com.appoinment.health.service;


import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.model.Patient;

import java.util.List;

public interface PatientService {
    Patient createPatient(Patient patient);
    List<Patient> getAll();
    PatientDto loginPatient(Patient patient);
}
