package com.org.gen.EmpApp;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	
	private static Employees List = new Employees();
	static {

		List.getEmployeeList().add(new Employee(1,"a","b","xyz"));
		List.getEmployeeList().add(new Employee(1,"p","q","pqr"));
	}
	public Employees getAllEmployees() {
		return List;
		
	}
	public void addEmployee(Employee employee)	{
		List.getEmployeeList().add(employee);
		
	}
}
