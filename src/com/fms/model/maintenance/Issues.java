package com.fms.model.maintenance;

import com.fms.model.users.*;
import com.fms.model.facility.*;

public interface Issues {
	public int getIssueId();
	public void setIssueId(int issueId);
	public IssueType getIssueType();
	public void setIssueType(IssueType issueType);
	public Employees getAssignee();
	public void setAssignee(Employees assignee);
	public String getComments();
	public void setComments(String comments);
	public Tenants getReporter();
	public void setReporter(Tenants reporter);
	public Room getRoomLocation();
	public void setRoomLocation(Room roomLocation);
	public Building getBuildingLocation();
	public void setBuildingLocation(Building buildingLocation);
	public String getCreationDate() ;
	public void setCreationDate(String creationDate);
	public String toString();
	public void setResolved(boolean r);
	public boolean getResolved();
	public String getResolvedDate();
	public void setCost(float c);
	public float getCost();
	public void setEstimatedTime(int t);
	public int getEstimatedTime();
}
