package com.fms.model.maintenance;

import com.fms.model.facility.Building;
import com.fms.model.facility.Room;
import com.fms.model.users.Employees;
import com.fms.model.users.Tenants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IssuesImpl implements Issues {

    // Attributes
    private int IssueId;
    private IssueType issueType;
    private Employees assignee;
    private String comments;
    private Tenants reporter;
    private Room roomLocation;
    private Building buildingLocation;
    private String creationDate;
    private boolean resolved;
    private String resolvedDate;
	private float cost;
	private int estimatedTime;

    // Methods
    public IssuesImpl(Tenants reporter, Room roomLocation, Building buildingLocation){
    	this.reporter = reporter; 
    	this.roomLocation = roomLocation;
    	this.buildingLocation = buildingLocation;
    	setDate();
    }
    public IssuesImpl(){
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

	public int getIssueId() {
		return IssueId;
	}

	public void setIssueId(int issueId) {
		IssueId = issueId;
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
		String s = ("Date Created: " + creationDate + "\nIssue Type: " + issueType.getDescription() + "\nBuilding No. " + buildingLocation.getBuildingID() +
				"\nRoom No. " + roomLocation + "" + "\nEmployee Assigned: " + assignee + "\nComments: " + comments + "\n");
		return s;
	}
	public void setResolved(boolean r){
		resolved = r;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date d = new Date();
        resolvedDate = dateFormat.format(d);
	}
	public boolean getResolved(){
		return resolved;	
	}
	public String getResolvedDate(){
		return resolvedDate;
	}
	public void setCost(float c) {cost = c;}
	public float getCost() {return cost;}

	public void setTime(int t) {
		estimatedTime = t;
	}

	public int getTime() {
		return estimatedTime;
	}
}
