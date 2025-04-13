package com.example.Jobsphere.controller;


import com.example.Jobsphere.model.jobseeker;
import com.example.Jobsphere.service.jobseekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class jobseekerController {

    @Autowired
    jobseekerService jobseekerService;

    @PostMapping("/add")
    public ResponseEntity<jobseeker> addjobseeker(@RequestBody jobseeker jobseekerid){
      jobseeker js =jobseekerService.addjobseeker(jobseekerid);
      if(js==null){
          return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);

      }else{
          return new ResponseEntity<>(js,HttpStatus.ACCEPTED);
      }

    }
    @GetMapping("/all")
    public ResponseEntity<List<jobseeker>>  alljobseeker(){
        return new ResponseEntity<>(jobseekerService.alljobseeker(),HttpStatus.OK);
    }
    @GetMapping("/jobseeker/{id}")
    public ResponseEntity<jobseeker> getByJobid(@PathVariable Integer id){
        jobseeker j = jobseekerService.jobseekerByJobid(id);
        if(j == null){
            return  new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(j,HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>delete_jobseeker(@PathVariable int id){
        jobseeker j = jobseekerService.jobseekerByJobid(id);
        if(j==null){
            return new ResponseEntity<>("user not found",HttpStatus.NOT_FOUND);
        }else{
            jobseekerService.delete_jobseeker(id);
            return new ResponseEntity<>("User deleted",HttpStatus.OK);
        }
    }


}
