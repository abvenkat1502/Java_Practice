package com.java.Java_Practice.Real_Time_Concepts;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String department;
	private double salary;
	private String role;
	
	//Constructor
	public Employee(int id, String name, String dept, double sal, String rol) {
		this.employeeId = id;
		this.employeeName = name;
		this.department = dept;
		this.salary = sal;
		this.role = rol;
	}
	
	//Getter
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getRole() {
		return role;
	}
	
	//Setter
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}
	
	public void setEmployeeName(String name) {
		this.employeeName= name ;
	}
	
	public void setDepartment(String dept) {
		this.department = dept;
	}
	
	public void setSalary(double saly) {
		this.salary = saly;
	}
	
	public void setRole(String rol) {
		this.role = rol;
	}
	
	//Display Details
	@Override
	public String toString() {
		return "Employee Id : " + employeeId + "\n" +
			   "Employee Name : " + employeeName + "\n" +
			   "Employee Department : " + department + "\n" +
			   "Employee Salary : " + salary + "\n" +
			   "Employee Role : " + role;
	}
	
}


