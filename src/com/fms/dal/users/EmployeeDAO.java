package com.fms.dal.users;

import com.fms.model.users.Employees;
import com.fms.model.users.EmployeesImpl;

public class EmployeeDAO {
	public EmployeeDAO(){};
	
	public Employees getEmployee(int employeeID)  {
		EmployeesImpl employee= new EmployeesImpl();
		return employee;
	}

	public void addEmployee(Employees employee)  {

	}

	public void deleteEmployee(int employeeID){

	}
}
