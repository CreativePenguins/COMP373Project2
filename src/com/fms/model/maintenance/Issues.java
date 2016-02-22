package com.fms.model.maintenance;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.fms.model.users.*;
import com.fms.model.facility.*;

public class Issues {

    // Attributes
    private String Issueid;
    private IssueType issueType;
    private Employees assignee;
    private String comments;
    private Tenants reporter;
    private Room roomLocation;
    private Building buildingLocation;
    private String creationDate;

    // Methods
    public Issues(Tenants reporter, Room roomLocation, Building buildingLocation){
    	this.reporter = reporter; 
    	this.roomLocation = roomLocation;
    	this.buildingLocation = buildingLocation;
    	setDate();
    }
    public Issues(){
		setDate();
	}
    
    //we only want to use this method upon creation of the issue
    private boolean setDate() {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //get current date time with Date()
            Date d = new Date();
            creationDate = dateFormat.format(d);
            return true;
    }

	public String getIssueid() {
		return Issueid;
	}

	public void setIssueid(String issueid) {
		Issueid = issueid;
	}

	public IssueType getIssueType() {
		return issueType;
	}

	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}

	public Employees getAssignee() {
		return assignee;
	}

	public void setAssignee(Employees assignee) {
		this.assignee = assignee;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Tenants getReporter() {
		return reporter;
	}

	public void setReporter(Tenants reporter) {
		this.reporter = reporter;
	}

	public Room getRoomLocation() {
		return roomLocation;
	}

	public void setRoomLocation(Room roomLocation) {
		this.roomLocation = roomLocation;
	}

	public Building getBuildingLocation() {
		return buildingLocation;
	}

	public void setBuildingLocation(Building buildingLocation) {
		this.buildingLocation = buildingLocation;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String toString(){
		String s = ("Issue Type: " + issueType.getDescription() + "\nBuilding No. " + buildingLocation.getBuildingID() +
				"\nRoom No. " + roomLocation + "" + "\nEmployee Assigned: " + assignee + "\nComments: " + comments + "\n");
		return s;
	}
}
