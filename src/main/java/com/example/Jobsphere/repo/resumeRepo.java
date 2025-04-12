package com.example.Jobsphere.repo;

import com.example.Jobsphere.model.resume;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface resumeRepo extends MongoRepository<resume, Integer> {
    List<resume> findByJobSeekerId(int jobSeekerId);
    resume findByJobSeekerIdAndResumeId(int jobSeekerId, int resumeId);
}