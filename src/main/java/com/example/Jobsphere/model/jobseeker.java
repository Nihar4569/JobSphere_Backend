package com.example.Jobsphere.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.*;

import java.math.BigInteger;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "Jobseekers")

public class Jobseeker {

    @Id
    private int jobid;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotNull
    private BigInteger phone;

    @NotBlank
    private String address;

    @NotBlank
    private String skills; // You can convert this to List<String> if needed

    private int experience; // in years

    private String resumeUrl; // path or cloud URL of uploaded resume




}
