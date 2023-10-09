package com.appoinment.health.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "review")
public class Review {

    @Id
    private Long id;
    private Patient patient;
    private Doctor doctor;
    private Appointment appointment;

}
