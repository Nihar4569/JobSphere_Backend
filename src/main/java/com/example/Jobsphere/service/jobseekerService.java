package com.example.Jobsphere.service;

import com.example.Jobsphere.model.Jobseeker;
import com.example.Jobsphere.repo.jobseekerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobseekerService {
    @Autowired
    jobseekerRepo jobseekerRepo;

    public Jobseeker addjobseeker(Jobseeker jobid){return jobseekerRepo.save(jobid);}
    public List<Jobseeker> alljobseeker(){return jobseekerRepo.findAll();}
    public Jobseeker jobseekerByJobid(int id){return jobseekerRepo.findByJobid(id);}
    public void delete_jobseeker(int id){
        Jobseeker j = jobseekerRepo.findByJobid(id);
        if(j!=null){
            jobseekerRepo.delete(j);
        }
    }


}
