package com.fms.model.facility;
import java.util.ArrayList;
import java.util.List;

public class Building {
	
	private String BuildingID;
	private Address address;
	private int Capacity;
	private int RoomsFilled;
	private int IssueCount;
	private ArrayList<Room> Rooms = new ArrayList<Room>();
	
	public Building(){}
	
	public String getBuildingID() {
		return BuildingID;
	}
	public void setBuildingID(String buildingID) {
		BuildingID = buildingID;
	}
	public Address getAddressID() {
		return address;
	}
	public void setAddressID(Address addressID) {
		address = addressID;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public int getRoomsFilled() {
		return RoomsFilled;
	}
	public void setRoomsFilled(int roomsFilled) {
		this.RoomsFilled = roomsFilled;
	}
	public int getIssueCount() {
		return IssueCount;
	}
	public void setIssueCount(int issueCount) {
		IssueCount = issueCount;
	}
	public ArrayList<Room> getRooms(){
		return Rooms;
	}
	public void addRoom(Room room){
		Rooms.add(room);
	}
}
