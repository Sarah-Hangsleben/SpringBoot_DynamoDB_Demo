package com.hangsleben.demo.controller;

import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import com.hangsleben.demo.entity.Employee;
import com.hangsleben.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.saveEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") String employeeId) {
        return employeeRepository.getEmployeeById(employeeId);
    }
    
    @GetMapping("/employees")
    public PaginatedScanList<Employee> getEmployees(Employee employee) {
        return employeeRepository.getEmployees(employee);
    }
    
      @GetMapping("/employees/department/{department}")
    public PaginatedScanList<Employee> getEmployeesByDepartment(@PathVariable("department") String department, Employee employee) {
        return employeeRepository.getEmployeesByDepartment(employee,department);
    }

    @DeleteMapping("/employee/{id}/delete")
    public String deleteEmployeeById(@PathVariable("id") String employeeId) {
        return  employeeRepository.deleteEmployeeById(employeeId);
    }

}
