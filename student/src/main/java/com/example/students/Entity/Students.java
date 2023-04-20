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

    public Students(){

    }

    public Integer getId(){
        return id;
    }

    public Integer setId(Integer id){
        this.id=id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname=lastname;
    }

    public Integer getMobile(){
        return mobile;
    }

    public void setMobile(Integer mobile){
        this.mobile=mobile;
    }

    public String getschoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age=age;
    }

    public Boolean getEligible() {
        return isEligible;
    }

    public void setIsEligible(boolean isEligible){
        this.isEligible=isEligible;
    }
}
