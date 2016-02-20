package com.fms.model.facility;
import java.util.ArrayList;
import java.util.List;
import com.fms.model.users.*;

public class Room {
	private String RoomID;
	private int Floor;
	private int RoomNo;
	private Tenants PrimaryTenantID;
	private boolean vacant;
	private ArrayList<Tenants> tenants = new ArrayList<Tenants>();
	
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
	public Tenants getPrimaryTenant() {
		return PrimaryTenantID;
	}
	public void setPrimaryTenantID(Tenants primaryTenantID) {
		PrimaryTenantID = primaryTenantID;
	}
	public boolean isVacant() {
		return vacant;
	}
	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	public int getTenantNumber() {
		return tenants.size();
	}
	public void addTenant(Tenants tenant) {
		tenants.add(tenant);
	}
	public ArrayList<Tenants> getTenants(){
		return tenants;
	}
}
