package com.example.Jobsphere.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "job_recommendations")
public class jobrecommend {

    @Id
    private String recommendationId;

    @NotBlank
    private String recruiterId;

    @NotBlank
    private String jobId;

    private double aiScore;

    @NotBlank
    private String recommendedAt;
}
