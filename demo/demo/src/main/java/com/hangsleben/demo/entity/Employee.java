package com.hangsleben.demo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "employee")
public class Employee {

    @DynamoDBHashKey(attributeName = "employeeId")
    public String employeeId;
    
    @DynamoDBAttribute(attributeName = "firstName")
    public String firstName;
    
    @DynamoDBAttribute(attributeName = "lastName")
    public String lastName;
    
    @DynamoDBAttribute(attributeName = "email")
    public String email;
    
    @DynamoDBAttribute(attributeName = "address")
    public String address;
    
    @DynamoDBAttribute(attributeName = "department")
    public String department;
    
    
    public String getEmployeeId() {
    	return employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
    	this.employeeId= employeeId;
    }

 
    public String getFirstName() {
    	return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName= firstName;
    }

    public String getLastName() {
    	return lastName;
    }
    
    public void setLastName(String lastName ) {
    	this.lastName= lastName;
    }
     
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email= email;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address= address;
    }
    
    public String getDepartment() {
    	return department;
    }
    
    public void setDepartment(String department) {
    	this.department= department;
    }
}
