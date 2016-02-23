package com.fms.dal;
import java.net.URISyntaxException;
import java.sql.Connection;
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
    	Statement st = DBHelper.getConnection().createStatement();
		IssueType i = new IssueType();
		return i;
	}
	//this method passes a newly created IssueType and adds a record to the database for it 
	public void addIssueType(IssueType issuetype) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
	}
}
