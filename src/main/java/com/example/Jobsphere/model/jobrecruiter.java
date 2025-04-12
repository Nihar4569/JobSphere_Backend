package com.example.Jobsphere.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "jobrecruiters")
public class jobrecruiter {

    @Id
    private int id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String designation;

    @NotBlank
    private String companyName;

    @NotBlank
    private String companyWebsite;

//    @NotBlank
//    private String industry;

    @NotBlank
    private String location;
}