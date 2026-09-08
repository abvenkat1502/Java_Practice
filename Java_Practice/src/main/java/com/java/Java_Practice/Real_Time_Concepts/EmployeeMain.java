package com.java.Java_Practice.Real_Time_Concepts;


import java.util.ArrayList;
import java.util.List;


public class EmployeeMain {
	
	public static void main(String[] args) {
		List<Employee>employees = new ArrayList<Employee>();
		
		
		//obj
		Employee emp1 = new Employee(1, "User 1", "Dev", 50000, "Senior");
		Employee emp2 = new Employee(2, "User 2", "QA", 40000, "Senior");
		Employee emp3 = new Employee(3, "User 3", "Admin", 30000, "Senior");
		Employee emp4 = new Employee(4, "User 4", "Dev", 60000, "Junior");
		Employee emp5 = new Employee(5, "User 5", "QA", 50000, "Junior");
		Employee emp6 = new Employee(6, "User 6", "Admin", 40000, "Junior");
		Employee emp7 = new Employee(7, "User 7", "Dev", 70000, "Intern");
		Employee emp8 = new Employee(8, "User 8", "QA", 60000, "Intern");
		Employee emp9 = new Employee(9, "User 9", "Admin", 50000, "Intern");
		Employee emp10 = new Employee(10, "User 10", "Dev", 80000, "Senior");
		
		//Employees in list
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		employees.add(emp8);
		employees.add(emp9);
		employees.add(emp10);
		
		//Print employee details
		System.out.println("----- Employee Details are -----");
		for (Employee employee : employees) {
			System.out.println(employee);
			System.out.println(" ");
		}
		
		//Find salary > 50,000
		for (Employee employee : employees) {
			if (employee.getSalary() > 50000) {
				System.out.println("Salary more than 50k user's are : " + employee.getEmployeeName());
			}
		}
		
		//Find QA employees
		for (Employee employee : employees) {
			if (employee.getDepartment().equals("QA")) {
				System.out.println("QA Department user's are : " + employee.getEmployeeName());
				System.out.println();
			}
		}
		
		
		//Find highest salary
		double highSal = 0.0;
		
		for (Employee employee : employees) {
			if(employee.getSalary() > highSal)	{
				highSal =  employee.getSalary();
			}		
		}
		
		for (Employee employee : employees) {
			if(employee.getSalary() == highSal)	{
				System.out.println("Highest salary Employee details are -----" + employee);
				System.out.println();
			}		
		}
		
		//Update employee
		emp10.setSalary(10000);

		
		//updated employee
		System.out.println("Updated Employee Details are : " + emp10);
	
	}

}
