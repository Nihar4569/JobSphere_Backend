package com.example.Jobsphere.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "resumes")
public class resume {

    @Id
    private int resumeId;

    @NotBlank
    private int jobSeekerId;

    @NotBlank
    private String filePath;

    @NotBlank
    private String uploadedAt;
}
