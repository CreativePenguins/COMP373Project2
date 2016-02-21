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
    private String date;

    // Methods
    public Issues(Tenants reporter, Room roomLocation, Building buildingLocation){
    	this.reporter = reporter; 
    	this.roomLocation = roomLocation;
    	this.buildingLocation = buildingLocation;
    	setDate();
    }
    
    public String getId() {
        return Issueid;
    }

    public void setId(String id) {
        this.Issueid = id;
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

    public void setAssignee(Employees employee) {
        this.assignee = employee;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Tenants getReporter() {
        return this.reporter;
    }

    public Room getRoom() {
        return this.roomLocation;
    }

    public Building getBuilding() {
        return buildingLocation;
    }

    //we only want to use this method upon creation of the issue
    private boolean setDate() {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //get current date time with Date()
            Date d = new Date();
            date = dateFormat.format(d);
            return true;
    }

    public String getDate() {
        return date;
    }
}
