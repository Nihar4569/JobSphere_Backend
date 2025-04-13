package com.example.Jobsphere.repo;

import com.example.Jobsphere.model.jobseeker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface jobseekerRepo extends MongoRepository<jobseeker,Integer> {
    jobseeker findByJobseekerid(int id);


}
