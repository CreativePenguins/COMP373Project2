package com.fms.dal;
import com.fms.model.users.*;

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
			String selectTenantQuery = "SELECT TenantID, Primary, FirstName, LastName, RoomID FROM Tenants WHERE TenantID = '" + tenantID + "'";

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
	
	public void addTenant(Tenants tenant) throws URISyntaxException, SQLException {
		Connection con = DBHelper.getConnection();
		PreparedStatement tenPst = null;

		try {
			String tenStm = "INSERT INTO Tenants(TenantID, 'Primary', FirstName, LastName) VALUES(?, ?, ?, ?)";
			System.out.println(tenPst);
			tenPst = con.prepareStatement(tenStm);
			tenPst.setString(1, tenant.getTenID());
			tenPst.setBoolean(2, tenant.isPrimary());
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
	
	public Employees getEmployee(String employeeID) {
		Employees e = new Employees();
		return e;
	}

	public void addEmployee(Employees employee){
	}
	
}
