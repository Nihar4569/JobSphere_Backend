package com.example.Jobsphere.controller;

import com.example.Jobsphere.model.resume;
import com.example.Jobsphere.service.resumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resume")
public class resumeController {

    @Autowired
    private resumeService resumeService;

    @PostMapping("/add")
    public ResponseEntity<resume> addResume(@RequestBody resume r) {
        resume saved = resumeService.addResume(r);
        if (saved == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        } else {
            return new ResponseEntity<>(saved, HttpStatus.ACCEPTED);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<resume>> getAllResumes() {
        return new ResponseEntity<>(resumeService.getAllResumes(), HttpStatus.OK);
    }

    @GetMapping("/resume/{jobSeekerId}")
    public ResponseEntity<List<resume>> getByJobSeekerId(@PathVariable int jobSeekerId) {
        List<resume> resumes = resumeService.getResumesByJobSeekerId(jobSeekerId);
        if (resumes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(resumes, HttpStatus.OK);
        }
    }


    @GetMapping("/resume/{jobSeekerId}/{resumeId}")
    public ResponseEntity<resume> getByJobSeekerIdAndResumeId(@PathVariable int jobSeekerId, @PathVariable int resumeId) {
        resume r = resumeService.getResumeByJobSeekerIdAndResumeId(jobSeekerId, resumeId);
        if (r == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(r, HttpStatus.OK);
        }
    }

    @DeleteMapping("/deleteByResumeId/{resumeId}")
    public ResponseEntity<String> deleteByResumeId(@PathVariable int resumeId) {
        if (resumeService.getResumeById(resumeId) != null) {
            resumeService.deleteResumeByResumeId(resumeId);
            return new ResponseEntity<>("Resume deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Resume not found", HttpStatus.NOT_FOUND);
        }
    }

}
