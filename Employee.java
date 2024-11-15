  package com.codetest.demo;
  
  public class Employee { 
  
    public Employee() {} 

     public Employee( 
        String employeeId, String firstName, String lastName, String email, List<String> phoneNos, String doj, Double salary) 
    { 
  
        super(); 
        this.employeeId = employeeId; 
        this.firstName = firstName; 
        this.lastName = lastName; 
        this.email = email; 
        this.phoneNos = phoneNos;
        this.doj = doj;
        this.salary = salary;
      
} 
       private String employeeId;
       private String firstName; 
       private String lastName; 
       private String email; 
       private List<String> phoneNos;
       private String doj;
       private double salary;
   
// Overriding the toString method 
    // to find all the values 
    @Override
   public String toString() { 
  
        return "Employee [employeeId="
            + employeeId + ", firstName="
            + firstName + ", lastName="
            + lastName + ", email="
            + email + ", phoneNos ="
            + phoneNos + ", DOJ = "
            + doj + ",Salary =" 
            + salary +"]";     
    } 
 public String getEmployeeId() { 
         return employeeId; 
    } 
  public void setEmployeeId(String employeeId)  { 
         this.employeeId = employeeId; 
    } 
   public String getFirstName()  { 
         return firstName; 
    } 
    public void setFirstName(String firstName) { 
         this.firstName = firstName; 
    } 
    public String getLastName() { 
         return lastName; 
    } 
    public void setLastName(String lastName) { 
         this.lastName = lastName; 
    } 
   public String getEmail() { 
         return email; 
    } 
    public void setEmail(String email) { 
         this.email = email; 
    } 
    public List<String> getPhoneNos() { 
         return phoneNos; 
    } 
    public void setPhoneNos(List<String> phoneNos) { 
         this.phoneNos = phoneNos; 
    } 
   public String getDOJ()  { 
         return doj; 
    } 
    public void setDOJ(String doj) { 
         this.doj = doj; 
    } 
   public double getSalary() { 
         return salary; 
    } 
  public void setSalary(double salary)  { 
         this.salary = salary; 
    } 
} 