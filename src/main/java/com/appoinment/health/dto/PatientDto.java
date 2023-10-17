package com.appoinment.health.dto;



import lombok.*;


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
