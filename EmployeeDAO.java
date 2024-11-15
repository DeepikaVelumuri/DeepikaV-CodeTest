 package com.codetest.demo; 

import org.springframework.stereotype.Repository; 

// Now we will import the Employee class to use its predefined properties 
import com.codetest.demo.Employees; 

@Repository

// DAO Class to create a list of employees 
public class EmployeeDAO { 

	private static Employees list = new Employees(); 

	// This block is executed before executing the main block as it is static 
	static
	{ 

		// Creating a few employees and adding them to the list
		 
		list.getEmployeeList().add( 
			new Employee( 
				1111, 
				"Ajay", 
				"Singh", 
				"ajaysingh@gmail.com",
				["9876543210", "0987654321"],
				"2010-07-29"
				"400000.0")); 

		list.getEmployeeList().add( 
			new Employee( 
				2222, 
				"Charan", 
				"Kumar", 
				"charankumar@gmail.com",
				["9832763487", "9685843823"],
				"2018-01-15"
				"1900000.0")); 

		list.getEmployeeList().add( 
			new Employee( 
				1111, 
				"Jatin", 
				"Khan", 
				"jatinkhan@gmail.com",
				["9585489547", "8765432987"],
				"2021-06-13"
				"500000.0"));  	  
	} 

	// This method returns the list of employees
	public Employees getAllEmployees() { 
		return list; 
	} 

	// This method is to add an employee to the employees list 
		public void	addEmployee(Employee employee) { 
		list.getEmployeeList() 
			.add(employee);  
	} 
	
	public static double calculateIncomeTax(double salary) {

       double incomeTax = 0.0;

       if (salary <= 250000) { 
		  incomeTax = 0;
       
	   } else if (salary > 250000 && salary <= 500000) { 
		  incomeTax = 0.05 * (salary - 250000);

       } else if (salary > 500000 && salary <= 1000000) {
           incomeTax = 12500 + 0.1 * (salary - 500000);

       } else if (salary > 1000000) {
           incomeTax = 100000 + 0.2 * (salary - 1000000);

	   }
       return incomeTax;
   }
   
   public static double calculateCessAmount(double salary) {
	  
		double cessAmount = 0.0;
		
		if(salary > 2500000) {
			cessAmount = 0.02 * (salary - 2500000);
  }
  return cessAmount;
} 
