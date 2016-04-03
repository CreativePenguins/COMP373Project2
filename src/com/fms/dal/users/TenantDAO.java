package com.fms.dal.users;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.helper.DBHelper;
import com.fms.model.users.Tenants;

public class TenantDAO {
	public TenantDAO(){};
	
	public Tenants getTenant(int tenantID) throws URISyntaxException {

		try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectTenantQuery = "SELECT Tenant_ID, FirstName, LastName, RoomID FROM Tenants WHERE TenantID = '" + tenantID + "'";

			ResultSet tenRS = st.executeQuery(selectTenantQuery);
			System.out.println("TenantDAO: ------- Query " + selectTenantQuery);

			Tenants tenant = new Tenants();
			while (tenRS.next()) {
				tenant.setTenID(tenRS.getInt("Tenant_ID"));
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
			String tenStm = "INSERT INTO Tenants( FirstName, LastName) VALUES(?, ?, ?)";
			System.out.println(tenPst);
			tenPst = con.prepareStatement(tenStm);
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
}
