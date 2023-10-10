package com.appoinment.health.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "review")
public class Review {

    @Id
    private String id;
    @DBRef
    @JsonIgnore
    private Patient patient;
    @DBRef
    @JsonIgnore
    private Doctor doctor;
    @DBRef
    @JsonIgnore
    private Appointment appointment;

}
