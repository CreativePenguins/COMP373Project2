package com.fms.model.facility;

public class Building {
	
	private String BuildingID;
	private String AddressID;
	private int Capacity;
	private int roomsFilled;
	private int IssueCount;
	
	public String getBuildingID() {
		return BuildingID;
	}
	public void setBuildingID(String buildingID) {
		BuildingID = buildingID;
	}
	public String getAddressID() {
		return AddressID;
	}
	public void setAddressID(String addressID) {
		AddressID = addressID;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public int getRoomsFilled() {
		return roomsFilled;
	}
	public void setRoomsFilled(int roomsFilled) {
		this.roomsFilled = roomsFilled;
	}
	public int getIssueCount() {
		return IssueCount;
	}
	public void setIssueCount(int issueCount) {
		IssueCount = issueCount;
	}
}
