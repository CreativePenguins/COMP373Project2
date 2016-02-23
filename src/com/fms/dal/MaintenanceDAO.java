package com.fms.dal;
import java.net.URISyntaxException;
import java.sql.*;

import com.fms.model.maintenance.*;

public class MaintenanceDAO {
	public MaintenanceDAO(){}
	
	//this method will retrieve an Issue by the ID entered
	public Issues getIssue(String issueID) throws SQLException, URISyntaxException{
		Issues i = new Issues();
    	Statement st = DBHelper.getConnection().createStatement();
		return i;
	}
	//this method passes a newly created Issue and adds a record to the database for it
	public void addIssue(Issues issue) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
	}
	//this method will retrieve and IssueType by the ID entered
	public IssueType getIssueType(String issueTypeID) throws SQLException, URISyntaxException{
    	try {
			Statement st = DBHelper.getConnection().createStatement();
			String selectIssTypeQuery = "SELECT typeid, description FROM issuetypes WHERE typeid = '" + issueTypeID + "'";

			ResultSet istRS = st.executeQuery(selectIssTypeQuery);
			System.out.println("IssTypeDAO: **************** Query " + selectIssTypeQuery);

			IssueType issueType = new IssueType();
			while (istRS.next()) {
				issueType.setId(istRS.getString("typeid"));
				issueType.setDescription(istRS.getString("description"));
			}
			istRS.close();
			st.close();
			return issueType;
		} catch (SQLException se) {
			System.err.println("IssueTypeDAO: Threw SQLException retrieving the issue type object.");
			System.err.println(se.getMessage());
		} return null;
	}
	//this method passes a newly created IssueType and adds a record to the database for it 
	public void addIssueType(IssueType issuetype) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
		PreparedStatement istyPst = null;

		try {
			String istyStm = "INSERT INTO issuetypes(typeid, description) VALUES(?,?)";
			istyPst = con.prepareStatement(istyStm);
			istyPst.setString(1, issuetype.getId());
			istyPst.setString(2, issuetype.getDescription());
			istyPst.executeUpdate();
		} catch (SQLException ex) {}
		finally {
			try{
				if (istyPst != null)
					istyPst.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				System.err.println("IsTyDAO: Threw a SQLExecp saving object");
				System.err.println(ex.getMessage());
			}
		}
	}
}
