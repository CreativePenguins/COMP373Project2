package com.fms.model.maintenance;

import com.fms.model.facility.Building;
import com.fms.model.facility.Room;
import com.fms.model.users.Employees;
import com.fms.model.users.Tenants;
import org.springframework.beans.factory.annotation.Autowired;

public interface Issues {
	public int getIssueId();
	@Autowired
	public void setIssueId(int issueId);
	public IssueType getIssueType();
	@Autowired
	public void setIssueType(IssueType issueType);
	public Employees getAssignee();
	@Autowired
	public void setAssignee(Employees assignee);
	public String getComments();
	@Autowired
	public void setComments(String comments);
	public Tenants getReporter();
	@Autowired
	public void setReporter(Tenants reporter);
	public Room getRoomLocation();
	@Autowired
	public void setRoomLocation(Room roomLocation);
	public Building getBuildingLocation();
	@Autowired
	public void setBuildingLocation(Building buildingLocation);
	public String getCreationDate() ;
	@Autowired
	public void setCreationDate(String creationDate);
	public String toString();
	@Autowired
	public void setResolved(boolean r);
	public boolean getResolved();
	public String getResolvedDate();
	@Autowired
	public void setCost(float c);
	public float getCost();
	@Autowired
	public void setEstimatedTime(int t);
	public int getEstimatedTime();
}
