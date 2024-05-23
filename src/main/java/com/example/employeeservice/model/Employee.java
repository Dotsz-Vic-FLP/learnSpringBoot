package com.example.employeeservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private int yearsOfService;

    // Constructors
    public Employee() {}
    public Employee(Integer id, String firstName, String lastName, int yearsOfService) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfService = yearsOfService;
    }

    // Getters
    public Integer getId() {
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
    public void setID(Integer id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }


}
