package com.fms.model.facility;
import java.util.ArrayList;
import java.util.List;
import com.fms.model.users.*;

public class Room {
	private String RoomID;
	private int RoomNo;
	private boolean vacant = true;
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
	public void setVacant() {
		this.vacant = tenants.isEmpty();
	}
	public int getTenantNumber() {
		return tenants.size();
	}
	public void addTenant(Tenants tenant) {
		if (vacant){vacant = false;}
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
	public void removeTenant(Tenants ten){
		for (Tenants temp: tenants){
			if (temp.getTenID() == ten.getTenID()){
				tenants.remove(temp);
			}
		if (tenants.isEmpty()) {vacant = true;}
		}
	}
	public String toString(){
		String s = ("\n\t"+RoomNo +": ");
		if (vacant) {
			s = s + "VACANT";
			return s;
		}
		else {
			for (Tenants t: tenants){
				s = s + t.toString();
			}
			return s;
		}
	}
}
