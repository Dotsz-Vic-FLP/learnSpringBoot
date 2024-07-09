package com.victorfelipejr.example.learnspringandcrud.controller;

import com.victorfelipejr.example.learnspringandcrud.model.Employee;
import com.victorfelipejr.example.learnspringandcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("coding/test")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
//    public List<Employee> getEmployeesWithMoreThanYearsOfService(int years) {
//        return employeeService.getEmployeesWithMoreThanYearsOfService(years);
//    }

//    @PutMapping("/employee/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeDetails){
//        Employee employee = employeeService.updateEmployee(employeeDetails);
//        return ResponseEntity.ok(employee);
//    }
}
