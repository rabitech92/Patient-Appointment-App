package com.appoinment.health.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "appointment")
public class Appointment {
    @Id
    private Long id;
    private Patient patient;
    private Doctor doctor;
    private Review review;

}
