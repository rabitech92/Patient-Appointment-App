package com.appoinment.health.dto;

import com.appoinment.health.model.Doctor;
import com.appoinment.health.model.Patient;
import com.appoinment.health.model.Review;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDto {

    private String id;
    private String name;
    private String email;
    private String type;
    private String password;


}
