package com.ouattara.daniel.student;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int ages;


    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate dob, int ages) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.ages = ages;
    }

    public Student(String name, String email, LocalDate dob, int ages) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.ages = ages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", ages=" + ages +
                '}';
    }
}
