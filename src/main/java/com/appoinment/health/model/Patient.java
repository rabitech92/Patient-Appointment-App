package com.appoinment.health.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "patients")
public class Patient {
    @Id
    private String id;
    private String name;
    private String mobileNo;
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
