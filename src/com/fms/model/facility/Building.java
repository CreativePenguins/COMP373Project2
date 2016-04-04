package com.fms.model.facility;

import com.fms.model.maintenance.Issues;
import com.fms.model.users.Tenants;

import java.util.ArrayList;

public interface Building {
	public int getBuildingID();
	public void setBuildingID(int id);
	public Address getAddress();
	public void setAddress(Address address);
	public int getIssueCount();
	public ArrayList<Issues> getIssues();
	public void addIssue(Issues i);
	public ArrayList<Room> getRooms();
	public String toString();
	public void addRoom(Room r);
	public Room getRoom(int i);
	public void addTenantToRoom(Tenants t, int roomNo);
}
