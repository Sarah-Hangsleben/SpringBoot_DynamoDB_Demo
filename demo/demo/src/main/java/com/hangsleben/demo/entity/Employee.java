package com.hangsleben.demo.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "EmployeeTable")
public class Employee {

    public String employeeId;
    public String department;
    public String firstName;
    public String lastName;
    public String email;
    public String address;
   
    
    @DynamoDBHashKey(attributeName = "employeeId")
    public String getEmployeeId() {
    	return employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
    	this.employeeId= employeeId;
    }
    
    @DynamoDBRangeKey(attributeName = "department")
    public String getDepartment() {
    	return department;
    }
    
    public void setDepartment(String department) {
    	this.department= department;
    }

    @DynamoDBAttribute(attributeName = "firstName")
    public String getFirstName() {
    	return firstName;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName= firstName;
    }
 
    @DynamoDBAttribute(attributeName = "lastName")
    public String getLastName() {
    	return lastName;
    }
    
    public void setLastName(String lastName ) {
    	this.lastName= lastName;
    }
    
    @DynamoDBAttribute(attributeName = "email")
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email= email;
    }
    
    @DynamoDBAttribute(attributeName = "address")
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address= address;
    }
    
}
