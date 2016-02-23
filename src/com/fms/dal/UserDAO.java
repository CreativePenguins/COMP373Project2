package com.fms.dal;
import com.fms.model.maintenance.IssueType;
import com.fms.model.users.*;
import com.fms.dal.MaintenanceDAO;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

	public Tenants getTenant(String tenantID) throws URISyntaxException {

		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectTenantQuery = "SELECT TenantID, FirstName, LastName, RoomID FROM Tenants WHERE TenantID = '" + tenantID + "'";

			ResultSet tenRS = st.executeQuery(selectTenantQuery);
			System.out.println("TenantDAO: ------- Query " + selectTenantQuery);

			Tenants tenant = new Tenants();
			while (tenRS.next()) {
				tenant.setTenID(tenRS.getString("TenantID"));
				tenant.setLastName(tenRS.getString("LastName"));
				tenant.setFirstName(tenRS.getString("FirstName"));
			} tenRS.close();
			st.close();
			return tenant;
		}
		catch (SQLException se) {
			System.err.print("TenantDAO: Threw a SQLException retrieving data...");
			System.err.println(se.getMessage());
		}return null;
	}
	
	public void addTenant(Tenants tenant) throws URISyntaxException, SQLException {
		Connection con = DBHelper.getConnection();
		PreparedStatement tenPst = null;

		try {
			String tenStm = "INSERT INTO Tenants(TenantID, FirstName, LastName) VALUES(?, ?, ?)";
			System.out.println(tenPst);
			tenPst = con.prepareStatement(tenStm);
			tenPst.setString(1, tenant.getTenID());
			tenPst.setString(3, tenant.getFirstName());
			tenPst.setString(4, tenant.getLastName());
			tenPst.executeUpdate();
		} catch (SQLException ex) {System.out.println(ex.getMessage());}
		finally {
			try {
				if (tenPst != null)
					tenPst.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				System.err.println("TenantDAO: Threw a SQLException adding data...");
				System.err.println(ex.getMessage());
			}
		}
	}
	
	public Employees getEmployee(String employeeID) throws URISyntaxException {
		MaintenanceDAO mdao = new MaintenanceDAO();
		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectEmployeeQuery = "SELECT employeeid, specialty1, specialty2, specialty3, firstname, lastname FROM Employees Where employeeid = '" + employeeID + "'";

			ResultSet empRS = st.executeQuery(selectEmployeeQuery);
			System.out.println("EmployeeDAO: *************** Query " + selectEmployeeQuery);

			Employees employees = new Employees();


			while (empRS.next()) {
				employees.setID(empRS.getString("employeeid"));
				employees.setFirstName(empRS.getString("firstname"));
				employees.setLastName(empRS.getString("lastname"));
				if(!(mdao.getIssueType(empRS.getString("specialty1")) ==null))
					employees.addSpecialty(mdao.getIssueType(empRS.getString("specialty1")));
				if(!(mdao.getIssueType(empRS.getString("specialty2")) ==null))
					employees.addSpecialty(mdao.getIssueType(empRS.getString("specialty2")));
				if(!(mdao.getIssueType(empRS.getString("specialty3")) ==null))
					employees.addSpecialty(mdao.getIssueType(empRS.getString("specialty3")));
			} empRS.close();
			st.close();
			return employees;
		} catch (SQLException se) {
			System.err.println("EmpDAO: Threw SQLExcep getting emp obj.");
			System.err.println(se.getMessage());
			se.printStackTrace();
		}
		return null;
	}

	public void addEmployee(Employees employee) throws URISyntaxException, SQLException {
		Connection con = DBHelper.getConnection();
		PreparedStatement empPst = null;

		try {
			String empStm = "INSERT INTO Employees(employeeid, specialty1, specialty2, specialty3, firstname, lastname) VALUES (?, ?, ?, ?, ?, ?)";
			empPst = con.prepareStatement(empStm);
			empPst.setString(1, employee.getID());
			empPst.setString(5, employee.getFirstName());
			empPst.setString(6, employee.getLastName());
			if(employee.getSpecialtyNum(0) != null)
				empPst.setString(2, employee.getSpecialtyNum(0).getId());
			if(employee.getSpecialtySize() > 1)
				empPst.setString(3, employee.getSpecialtyNum(1).getId());
			if(employee.getSpecialtySize() > 2)
				empPst.setString(4, employee.getSpecialtyNum(2).getId());
			empPst.executeUpdate();
		} catch (SQLException ex) { System.err.println(ex.getMessage()); }
		finally {
			try {
				if(empPst != null)
					empPst.close();
				if(con != null)
					con.close();
			} catch (SQLException ex) {
				System.err.println("EmpDAO: SQLExcep adding...");
				System.err.println(ex.getMessage());
			}
		}
	}
}
	

