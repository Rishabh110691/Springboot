package com.example.students.Service;

import com.example.students.Entity.Students;
import com.example.students.Repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentsRepository repository;

    public String createStudent(Students students){
    Students save=repository.save(students);
   // Students students1=repository.saveAndFlush(students);
        return "Data Saved Successfully";
    }
}
