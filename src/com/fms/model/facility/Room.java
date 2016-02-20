package com.fms.model.facility;
import java.util.ArrayList;
import java.util.List;
import com.fms.model.users.*;

public class Room {
	private String RoomID;
	private int RoomNo;
	private boolean vacant;
	private ArrayList<Tenants> tenants = new ArrayList<Tenants>();
	
	public Room(){}
	
	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
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
	public Tenants getPrimaryTenant(){
		for (Tenants tenant: tenants){
			if (tenant.isPrimary()){
				return tenant;
			}
		}
		return tenants.get(0);
	}
}
