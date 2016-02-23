package com.fms.dal;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	}
}
