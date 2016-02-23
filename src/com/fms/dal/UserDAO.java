package com.fms.dal;
import com.fms.model.users.*;
import com.sun.corba.se.spi.orbutil.fsm.Guard;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

	//TODO Make Statement

	public Tenants getTenant(String tenantID) throws URISyntaxException {

		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectTenantQuery = "SELECT tenantID, lname, fname FROM Tenant WHERE tenantID = '" + tenantID + "'";

			ResultSet tenRS = st.executeQuery(selectTenantQuery);
			System.out.println("TenantDAO: ------- Query " + selectTenantQuery);

			Tenants tenant = new Tenants();
			while (tenRS.next()) {
				tenant.setTenID(tenRS.getString("TenantID"));
				tenant.setLastName(tenRS.getString("LastName"));
				tenant.setFirstName(tenRS.getString("FirstName"));
				tenant.setPrimary(tenRS.getBoolean("Primary"));
			} tenRS.close();
			st.close();
			return tenant;
		}
		catch (SQLException se) {
			System.err.print("TenantDAO: Threw a SQLException retrieving data...");
			System.err.println(se.getMessage());
		}return null;
	}
	
	public void addTenant(Tenants tenant){
	}
	
	public Employees getEmployee(String employeeID) throws URISyntaxException {
	}
	public void addEmployee(Employees employee){
	}
	
}
