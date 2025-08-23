package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    private String gender;

    public Long getId() { return id; }
    public String getName() { return name; }
    public LocalDate getDob() { return dob; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDob(LocalDate dob) { this.dob = dob; }
    public void setEmail(String email) { this.email = email; }
    public void setGender(String gender) { this.gender = gender; }

}
