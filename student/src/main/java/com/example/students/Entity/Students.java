package com.example.students.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer mobile;
    private String schoolName;
    private Integer age;
    private Boolean isEligible;
}
