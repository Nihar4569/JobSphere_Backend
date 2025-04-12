package com.example.Jobsphere.service;

import com.example.Jobsphere.model.resume;
import com.example.Jobsphere.repo.resumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class resumeService {

    @Autowired
    private resumeRepo resumeRepo;

    public resume addResume(resume r) {
        return resumeRepo.save(r);
    }

    public List<resume> getAllResumes() {
        return resumeRepo.findAll();
    }

    public List<resume> getResumesByJobSeekerId(int jobSeekerId) {
        return resumeRepo.findByJobSeekerId(jobSeekerId);
    }


    public resume getResumeByJobSeekerIdAndResumeId(int jobSeekerId, int resumeId) {
        return resumeRepo.findByJobSeekerIdAndResumeId(jobSeekerId, resumeId);
    }

    public void deleteResumeByResumeId(int resumeId) {
        if (resumeRepo.existsById(resumeId)) {
            resumeRepo.deleteById(resumeId);
        }
    }
    public resume getResumeById(int resumeId) {
        return resumeRepo.findById(resumeId).orElse(null);
    }


}

