package com.example.Jobsphere.service;

import com.example.Jobsphere.model.jobrecruiter;
import com.example.Jobsphere.repo.jobrecruiterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobrecruiterService {

    @Autowired
    private jobrecruiterRepo jobrecruiterRepo;

    public jobrecruiter addjobrecruiter(jobrecruiter recruiter) {
        return jobrecruiterRepo.save(recruiter);
    }

    public List<jobrecruiter> alljobrecruiters() {
        return jobrecruiterRepo.findAll();
    }

    public jobrecruiter getjobrecruiterById(int id) {
        return jobrecruiterRepo.findById(id);
    }

    public void deletejobrecruiter(int id) {
        jobrecruiter recruiter = jobrecruiterRepo.findById(id);
        if (recruiter != null) {
            jobrecruiterRepo.delete(recruiter);
        }
    }
}
