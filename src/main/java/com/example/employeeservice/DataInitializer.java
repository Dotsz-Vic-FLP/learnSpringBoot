package com.example.employeeservice;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee(1, "John","Doe", 20));
        employeeRepository.save(new Employee(2, "Debbie", "Williams", 15));
        employeeRepository.save(new Employee(3, "Joe", "Jones",9));
        employeeRepository.save(new Employee(4, "Helen", "Chan", 5));
        employeeRepository.save(new Employee(5, "John", "Smith", 12));
    }
}
