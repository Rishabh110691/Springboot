package com.example.students.Repository;

import com.example.students.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {


}
