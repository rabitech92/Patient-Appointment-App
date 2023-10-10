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
@Document(collection = "doctor")
public class Doctor {

    @Id
    private String id;
    List<Appointment> listOfAppointments = new ArrayList<>();
    List<Message> listOfMessage = new ArrayList<>();
    private List<Review> listOfReviews = new ArrayList<>();


}
