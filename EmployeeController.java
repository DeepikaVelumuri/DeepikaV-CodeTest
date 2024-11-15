package com.codetest.demo; 

import java.net.URI; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.servlet.support.ServletUriComponentsBuilder; 

// Import the previously-defined classes to use the properties of those classes 
import com.codetest.demo.EmployeeList; 
import com.codetest.demo.EmployeeDAO; 
import com.codetest.demo.Employee; 

// Creating the REST controller 
@RestController
@RequestMapping(path = "/api/employees") 
public class EmployeeController { 

	@Autowired
 private EmployeeDAO employeeDao; 
	  
		// Implementing a GET method to get the list of all the employees 
 @GetMapping(path = "/", produces = "application/json") 

	public Employees getEmployees() { 
		return employeeDao.getAllEmployees(); 
	} 
	
	// Create a POST method to add an employee to the list 
 @PostMapping( 
		path = "/", 
		consumes = "application/json", 
		produces = "application/json") 

	public ResponseEntity<Object> addEmployee( 
		@RequestBody Employee employee) 
	{ 

		// Creating an ID of an employee from the total number of employees 
		String id 	= employeeDao.getAllEmployees().getEmployeeList().size()+ 1; 

		employee.setEmployeeId(id); 
		employeeDao.addEmployee(employee); 
		double incomeTax = employeeDao.calculateIncomeTax(employee.getSalary());
		double cessAmount = employeeDao.calculateCessAmount(employee.getSalary());
		

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}") 
				.buildAndExpand(employee.getId()) 
				.toUri(); 

		   return ResponseEntity.created(location).build(); 
	} 
} 
