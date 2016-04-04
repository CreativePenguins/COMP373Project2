package com.fms.model.service;

import com.fms.dal.users.EmployeeDAO;
import com.fms.dal.users.TenantDAO;
import com.fms.model.users.Employees;
import com.fms.model.users.Tenants;

public class UserService {
	private EmployeeDAO empDAO = new EmployeeDAO();
	private TenantDAO tenDAO = new TenantDAO();
	
	//search tenants by ID from the DB
		public Tenants findTenantById(int tenantID) {
				
			try {
				Tenants tenant = tenDAO.getTenant(tenantID);
		    	return tenant;
		    } catch (Exception se) {
		      System.err.println("UserService: Threw a Exception retrieving Tenant.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
		
		//Insert a new Tenant in the DB
		public void addTenant(Tenants t) {
			try {
				tenDAO.addTenant(t);
		    } catch (Exception se) {
		      System.err.println("UserService: Threw a Exception adding Tenant.");
		      System.err.println(se.getMessage());
		    }
		}
		//search Employees by ID from the DB
		public Employees findEmployeeById(int employeeID) {
				
			try {
				Employees employee = empDAO.getEmployee(employeeID);
		    	return employee;
		    } catch (Exception se) {
		      System.err.println("UserService: Threw a Exception retrieving Employee.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
		
		//Insert a new Employee in the DB
		public void addEmployee(Employees e) {
			
			try {
				empDAO.addEmployee(e);
		    } catch (Exception se) {
		      System.err.println("UserService: Threw a Exception adding Employee.");
		      System.err.println(se.getMessage());
		    }
		}
}
