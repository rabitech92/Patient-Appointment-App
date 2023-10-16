package com.appoinment.health.service.impl;

import com.appoinment.health.dto.PatientDto;
import com.appoinment.health.exception.PatientException;
import com.appoinment.health.model.Patient;
import com.appoinment.health.repository.PatientRepository;
import com.appoinment.health.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private static PatientRepository patientRepository;
    public static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10, new SecureRandom());
    public static ModelMapper modelMapper;



    @Override
    public PatientDto createPatient(Patient patient) throws PatientException {
    Patient patientData=patientRepository.existsPatientByEmail(patient.getEmail());
        if (patientData==null){
            patient.setType("Patient");
            patient.setPassword(bCryptPasswordEncoder.encode(patient.getPassword()));
            patientRepository.save(patient);
            return convertDto(patient);
        }else {
            throw new PatientException("Patient already register with this email no " + patient.getEmail());
        }

    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public PatientDto loginPatient(Patient patient) {
        PatientDto patientDto = new PatientDto();
        patientDto.setEmail(patient.getEmail());
        patientDto.setPassword(patientDto.getPassword());
        patientRepository.existsPatientByEmail(patient.getEmail());
        return patientDto;
    }

    public PatientDto convertDto(Patient patient){
        PatientDto patientDto=modelMapper.map(patient,PatientDto.class);
        return patientDto;
    }
}
