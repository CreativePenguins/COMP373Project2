package com.fms.dal;
import java.sql.Statement;

import com.fms.model.facility.*;
import com.ebook.dal.DBHelper;
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
		Connection con = DBHelper.getConnection();
	}
	
	public Address getAddress(String addressID){
		Address a = new Address();
    	Statement st = DBHelper.getConnection().createStatement();
		return a;
	}
	
	public void addAddress(Address address){
		Connection con = DBHelper.getConnection();
	}
	
	public Room getRoom(String RoomID){
    	Statement st = DBHelper.getConnection().createStatement();
		Room r = new Room();
		return r;
	}
}
