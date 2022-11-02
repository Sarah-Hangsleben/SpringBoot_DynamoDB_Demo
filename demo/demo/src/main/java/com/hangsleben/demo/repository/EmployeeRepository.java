package com.hangsleben.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import com.hangsleben.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Employee saveEmployee(Employee employee) {
        dynamoDBMapper.save(employee);
        return employee;
    }

    public Employee getEmployeeById(String employeeId) {
        return dynamoDBMapper.load(Employee.class, employeeId);
    }
    
    public PaginatedScanList <Employee> getEmployees(Employee employee) {
        DynamoDBScanExpression paginatedScanListExpression = new DynamoDBScanExpression()
          .withLimit(2);
        PaginatedScanList <Employee> paginatedList = dynamoDBMapper.scan(Employee.class, paginatedScanListExpression);
       return paginatedList;
     }

    public String deleteEmployeeById(String customerId) {
        dynamoDBMapper.delete(dynamoDBMapper.load(Employee.class, customerId));
        return "Customer Id : "+ customerId +" deleted";
    }

}