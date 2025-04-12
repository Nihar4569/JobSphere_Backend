package com.example.Jobsphere.controller;

import com.example.Jobsphere.model.jobrecruiter;
import com.example.Jobsphere.service.jobrecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobrecruiter")
public class jobrecruiterController {

    @Autowired
    private jobrecruiterService jobrecruiterService;

    @PostMapping("/add")
    public ResponseEntity<jobrecruiter> addjobrecruiter(@RequestBody jobrecruiter recruiter) {
        jobrecruiter saved = jobrecruiterService.addjobrecruiter(recruiter);
        if (saved == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        } else {
            return new ResponseEntity<>(saved, HttpStatus.ACCEPTED);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<jobrecruiter>> getAllJobRecruiters() {
        return new ResponseEntity<>(jobrecruiterService.alljobrecruiters(), HttpStatus.OK);
    }

    @GetMapping("/jobrecruiter/{id}")
    public ResponseEntity<jobrecruiter> getById(@PathVariable int id) {
        jobrecruiter recruiter = jobrecruiterService.getjobrecruiterById(id);
        if (recruiter == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(recruiter, HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        jobrecruiter recruiter = jobrecruiterService.getjobrecruiterById(id);
        if (recruiter == null) {
            return new ResponseEntity<>("Recruiter not found", HttpStatus.NOT_FOUND);
        } else {
            jobrecruiterService.deletejobrecruiter(id);
            return new ResponseEntity<>("Recruiter deleted", HttpStatus.OK);
        }
    }
}
