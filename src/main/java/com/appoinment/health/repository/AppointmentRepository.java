package com.appoinment.health.repository;

import com.appoinment.health.model.Appointment;
import com.appoinment.health.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,Long> {
}
