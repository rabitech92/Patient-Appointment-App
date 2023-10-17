package com.appoinment.health.repository;


import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends MongoRepository<Patient,String> {
    Patient existsPatientByEmail(String email);
}
