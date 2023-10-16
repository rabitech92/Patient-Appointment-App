package com.appoinment.health.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "patients")
public class Patient {
    @Id
    private String id;
    private String name;
    private String email;
    private String type;
    private String password;


    @DBRef
    @JsonIgnore
    List<Appointment> listOfAppointments = new ArrayList<>();
    @DBRef
    @JsonIgnore
    List<Review> listReviews = new ArrayList<>();
    @DBRef
    @JsonIgnore
    List<Message> listOfMessage = new ArrayList<>();

}
