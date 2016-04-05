package com.fms.dal.users;

import com.fms.dal.HibernatePGSQLHelper;
import com.fms.model.users.Employees;
import com.fms.model.users.EmployeesImpl;
import org.hibernate.Session;

public class EmployeeDAO {
	public EmployeeDAO(){};
	
	public Employees getEmployee(int employeeID)  {
		EmployeesImpl employee= new EmployeesImpl();
		return employee;
	}
	public /**ArrayList<Employees> **/ int getEmployees(){
		return 0;
	}
	public void addEmployee(Employees employee)  {
		System.out.println("*************** Adding Employee in DB with ID..." + employee.getID());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}

	public void deleteEmployee(Employees emp){
		System.out.println("*************** Deleteing customer information in DB with ID ...  " + emp.getID());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(emp);
		session.getTransaction().commit();
	}
}
