package com.appoinment.health.service.impl;

import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.model.Patient;
import com.appoinment.health.repository.PatientRepository;
import com.appoinment.health.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public PatientDto loginPatient(Patient patient) {
        PatientDto patientDto = new PatientDto();
        patientDto.setMobileNo(patient.getMobileNo());
        patientDto.setPassword(patientDto.getPassword());
        patientRepository.existsPatientByMobileNo(patient.getMobileNo());
        return patientDto;
    }
}
