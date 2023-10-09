package com.appoinment.health.service.impl;

import com.appoinment.health.model.Patient;
import com.appoinment.health.repository.PatientRepository;
import com.appoinment.health.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
