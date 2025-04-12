package com.example.Jobsphere.repo;

import com.example.Jobsphere.model.jobrecruiter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface jobrecruiterRepo extends MongoRepository<jobrecruiter, Integer> {
    jobrecruiter findById(int id);
}
