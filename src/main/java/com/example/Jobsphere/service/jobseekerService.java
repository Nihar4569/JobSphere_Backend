package com.example.Jobsphere.service;

import com.example.Jobsphere.model.jobseeker;
import com.example.Jobsphere.repo.jobseekerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobseekerService {
    @Autowired
    jobseekerRepo jobseekerRepo;

    public jobseeker addjobseeker(jobseeker jobid){return jobseekerRepo.save(jobid);}
    public List<jobseeker> alljobseeker(){return jobseekerRepo.findAll();}
    public jobseeker  jobseekerByJobid(int id){return jobseekerRepo.findByJobseekerid(id);}
    public void delete_jobseeker(int id){
        jobseeker j = jobseekerRepo.findByJobseekerid(id);
        if(j!=null){
            jobseekerRepo.delete(j);
        }
    }


}
