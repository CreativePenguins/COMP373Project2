package com.fms.model.facility;

public class Room {
	private String RoomID;
	private int Floor;
	private int RoomNo;
	private String BuildingID;
	private String PrimaryTenantID;
	private boolean vacant;
	private int TenantNumber;
	
	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public String getBuildingID() {
		return BuildingID;
	}
	public void setBuildingID(String buildingID) {
		BuildingID = buildingID;
	}
	public String getPrimaryTenantID() {
		return PrimaryTenantID;
	}
	public void setPrimaryTenantID(String primaryTenantID) {
		PrimaryTenantID = primaryTenantID;
	}
	public boolean isVacant() {
		return vacant;
	}
	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	public int getTenantNumber() {
		return TenantNumber;
	}
	public void setTenantNumber(int tenantNumber) {
		TenantNumber = tenantNumber;
	}
}
