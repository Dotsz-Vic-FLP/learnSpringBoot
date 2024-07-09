package com.victorfelipejr.example.learnspringandcrud.config;

import com.victorfelipejr.example.learnspringandcrud.model.Employee;
import com.victorfelipejr.example.learnspringandcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception{

        // Reset data
        employeeRepository.deleteAll();

        // Create new data
        employeeRepository.save(new Employee("John", "Doe", 20));
        employeeRepository.save(new Employee("Debbie","Williams", 15));
        employeeRepository.save(new Employee("Joe", "Jones", 9));
        employeeRepository.save(new Employee("Helen", "Chan", 5));
        employeeRepository.save(new Employee("John", "Smith", 12));
    }


}
