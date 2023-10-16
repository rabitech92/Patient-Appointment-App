package com.appoinment.health.repository;

import com.appoinment.health.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient,String> {
    Patient existsPatientByEmail(String email);
}
