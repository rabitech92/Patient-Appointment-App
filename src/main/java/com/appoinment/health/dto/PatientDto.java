package com.appoinment.health.dto;


import com.appoinment.health.model.Appointment;
import com.appoinment.health.model.Message;
import com.appoinment.health.model.Review;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {

    private String id;
    private String name;
    private String email;
    private String type;
    private String password;

}
