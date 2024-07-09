package com.victorfelipejr.example.learnspringandcrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int yearsOfService;

    // Default constructor
    public Employee() {
    }
    // Constructor with parameters
    public Employee(String firstName, String lastName, int yearsOfService){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfService = yearsOfService;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYearsOfService() {
        return yearsOfService;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

}
