package com.appoinment.health.repository;

import com.appoinment.health.model.Doctor;
import com.appoinment.health.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor,String> {
}
