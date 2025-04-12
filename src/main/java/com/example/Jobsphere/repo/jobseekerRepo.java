package com.example.Jobsphere.repo;

import com.example.Jobsphere.model.Jobseeker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface jobseekerRepo extends MongoRepository<Jobseeker,Integer> {
    Jobseeker findByJobid(int id);


}
