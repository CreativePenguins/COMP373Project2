package com.fms.dal.users;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.helper.DBHelper;
import com.fms.dal.maintenance.IssueTypeDAO;
import com.fms.model.users.Employees;

public class EmployeeDAO {
	public EmployeeDAO(){};
	
	public Employees getEmployee(String employeeID) throws URISyntaxException {
		IssueTypeDAO itdao = new IssueTypeDAO();

		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectEmployeeQuery = "SELECT employee_id, specialty1, specialty2, specialty3, firstname, lastname FROM Employees Where employeeid = '" + employeeID + "'";

			ResultSet empRS = st.executeQuery(selectEmployeeQuery);
			System.out.println("EmployeeDAO: *************** Query " + selectEmployeeQuery);

			Employees employees = new Employees();


			while (empRS.next()) {
				employees.setID(empRS.getInt("employee_id"));
				employees.setFirstName(empRS.getString("firstname"));
				employees.setLastName(empRS.getString("lastname"));
				if(!(itdao.getIssueType(empRS.getString("specialty1")) ==null))
					employees.addSpecialty(itdao.getIssueType(empRS.getString("specialty1")));
				if(!(itdao.getIssueType(empRS.getString("specialty2")) ==null))
					employees.addSpecialty(itdao.getIssueType(empRS.getString("specialty2")));
				if(!(itdao.getIssueType(empRS.getString("specialty3")) ==null))
					employees.addSpecialty(itdao.getIssueType(empRS.getString("specialty3")));
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
			String empStm = "INSERT INTO Employees(specialty1, specialty2, specialty3, firstname, lastname) VALUES (?, ?, ?, ?, ?, ?)";
			empPst = con.prepareStatement(empStm);
			empPst.setString(5, employee.getFirstName());
			empPst.setString(6, employee.getLastName());
			if(employee.getSpecialtyNum(0) != null)
				empPst.setInt(2, employee.getSpecialtyNum(0).getId());
			if(employee.getSpecialtySize() > 1)
				empPst.setInt(3, employee.getSpecialtyNum(1).getId());
			if(employee.getSpecialtySize() > 2)
				empPst.setInt(4, employee.getSpecialtyNum(2).getId());
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
