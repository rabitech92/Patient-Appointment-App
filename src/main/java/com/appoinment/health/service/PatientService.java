package com.appoinment.health.service;


import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.exception.PatientException;
import com.appoinment.health.model.Patient;

import java.util.List;

public interface PatientService {
    PatientDto createPatient(Patient patient) throws PatientException;
    List<Patient> getAll();
    PatientDto loginPatient(Patient patient);
}
