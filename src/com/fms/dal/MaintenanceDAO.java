package com.fms.dal;
import com.fms.model.maintenance.*;

public class MaintenanceDAO {
	public MaintenanceDAO(){}
	
	//this method will retrieve an Issue by the ID entered
	public Issues getIssue(String issueID){
		Issues i = new Issues();
		return i;
	}
	//this method passes a newly created Issue and adds a record to the database for it
	public void addIssue(Issues issue){
	}
	//this method will retrieve and IssueType by the ID entered
	public IssueType getIssueType(String issueTypeID){
		IssueType i = new IssueType();
		return i;
	}
	//this method passes a newly created IssueType and adds a record to the database for it 
	public void addIssueType(IssueType issuetype){
	}
}
