package com.example.Jobsphere.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "jobs")
public class job {

    @Id
    private String jobId;

    @NotBlank
    private String recruiterId; // FK to JobRecruiter

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String requiredSkills;

    @NotBlank
    private String experienceLevel;

    @NotBlank
    private String location;

    @NotBlank
    private String salaryRange;

    @NotBlank
    private String postedAt;
}
