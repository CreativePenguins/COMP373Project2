package com.fms.model.service;
import com.fms.dal.*;
import com.fms.model.maintenance.*;

public class MaintenanceService {
	private MaintenanceDAO maintDAO = new MaintenanceDAO();
	
	//search issues by ID from the DB
	public Issues findIssueById(String issueID) {
			
		try {
			Issues issue = maintDAO.getIssue(issueID);
	    	return issue;
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception retrieving Issue.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	
	//Insert a new Issue in the DB
	public void addIssue(Issues i) {
		
		try {
			maintDAO.addIssue(i);
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception adding issue.");
	      System.err.println(se.getMessage());
	    }
	}
	//Retrieve IssueType by ID from the database
	public IssueType FindIssueTypeByID (String issuetypeID){
		try {
			IssueType issuetype = maintDAO.getIssueType(issuetypeID);
	    	return issuetype;
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception retrieving IssueType.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	//Insert a new IssueType into the DB
	public void addIssueType(IssueType i) {
		try {
			maintDAO.addIssueType(i);
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception adding IssueType.");
	      System.err.println(se.getMessage());
	    }
	}
}
