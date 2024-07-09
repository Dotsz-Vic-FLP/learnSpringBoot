package com.victorfelipejr.example.learnspringandcrud.repository;


import com.victorfelipejr.example.learnspringandcrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByYearsOfServiceGreaterThan(int years);
}