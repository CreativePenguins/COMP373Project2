package com.fms.dal;
import java.sql.Statement;

import com.fms.model.facility.*;
import com.fms.dal.*;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacilityDAO {
	public FacilityDAO(){}
	
	public Building getBuilding(String buildingID) throws SQLException, URISyntaxException{
		Building b = new Building();
    	Statement st = DBHelper.getConnection().createStatement();
    	
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
