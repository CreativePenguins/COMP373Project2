package com.fms.dal;
import com.fms.model.facility.*;

public class FacilityDAO {
	public FacilityDAO(){}
	
	public Building getBuilding(String buildingID){
		Building b = new Building();
		return b;
	}
	
	public void addBuilding (Building building){
	}
	
	public Address getAddress(String addressID){
		Address a = new Address();
		return a;
	}
	
	public void addAddress(Address address){
	}
	
	public Room getRoom(String RoomID){
		Room r = new Room();
		return r;
	}
}
