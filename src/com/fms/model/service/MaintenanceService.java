package com.fms.model.service;

import com.fms.dal.maintenance.IssueDAO;
import com.fms.dal.maintenance.IssueTypeDAO;
import com.fms.model.maintenance.IssueTypeImpl;
import com.fms.model.maintenance.*;

public class MaintenanceService {
	private IssueDAO issueDAO = new IssueDAO();
	private IssueTypeDAO issTyDAO = new IssueTypeDAO();
	
	//search issues by ID from the DB
	public IssuesImpl findIssueById(int issueID) {
			
		try {
			IssuesImpl issue = issueDAO.getIssue(issueID);
	    	return issue;
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception retrieving Issue.");
	      System.err.println(se.getMessage());
	    }
		return null;
	}
	//get all Issues in the database
	public /** ArrayList<Issues>**/ int getAllIssues(){
		return 0;
	}
	//Insert a new Issue in the DB
	public void addIssue(Issues i) {
		
		try {
			issueDAO.addIssue(i);
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception adding issue.");
	      System.err.println(se.getMessage());
	    }
	}
	//delete issue in the DB
	public void deleteIssue(Issues IssueID){
		try {
			issueDAO.deleteIssue(IssueID);
		}catch (Exception se) {
			System.err.println("MaintenanceService: Threw an Exception deleting issue.");
			System.err.println(se.getMessage());
		}
	}
	//Retrieve IssueType by ID from the database
	public IssueTypeImpl FindIssueTypeByID (int issuetypeID){
		try {
			IssueTypeImpl issuetype = issTyDAO.getIssueType(issuetypeID);
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
			issTyDAO.addIssueType(i);
	    } catch (Exception se) {
	      System.err.println("MaintenanceService: Threw a Exception adding IssueType.");
	      System.err.println(se.getMessage());
	    }
	}
}
