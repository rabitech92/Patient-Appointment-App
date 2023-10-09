package com.appoinment.health.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "patient")
public class Patient {
    @Id
    private Long id;
    private String name;
    private String mobileNo;
    private String password;
    private String email;

    List<Appointment> listOfAppointments = new ArrayList<>();
    List<Review> listReviews = new ArrayList<>();
    List<Message> listOfMessage = new ArrayList<>();

}
