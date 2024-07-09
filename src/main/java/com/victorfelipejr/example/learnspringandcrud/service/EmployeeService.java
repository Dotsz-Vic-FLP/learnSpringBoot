package com.victorfelipejr.example.learnspringandcrud.service;

import com.victorfelipejr.example.learnspringandcrud.repository.EmployeeRepository;
import com.victorfelipejr.example.learnspringandcrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeesWithMoreThanYearsOfService(int years) {
        return employeeRepository.findByYearsOfServiceGreaterThan(years);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
