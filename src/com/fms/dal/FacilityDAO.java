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
		Statement st = DBHelper.getConnection().createStatement();
		String selectBuildingQuery = "SELECT BuildingID,AddressID, IssueCount FROM Building WHERE BuildingID = '" + buildingID + "'";
    	
		ResultSet builRS = st.executeQuery(selectBuildingQuery);
		System.out.println("FacilityDAO: ***************** Query " + selectBuildingQuery);
		
		//Get Building 
		Building building = new Building();
		while (builRS.next() ){
			building.setBuildingID(builRS.getString("BuildingID"));
		}
		return building;
	}
	
	public void addBuilding (Building building) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
	}
	
	public Address getAddress(String addressID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
    	String selectAddressQuery = "SELECT AddressID, AddressNo, Street, City, State, Zip FROM Address WHERE AddressID ='" + addressID + "'";
    	
    	ResultSet addRS = st.executeQuery(selectAddressQuery);
    	System.out.println("AddressDAO: *********** Query " + selectAddressQuery);
    	
    	//Get Address 
    	Address address = new Address();
    	while (addRS.next()){
    		address.setAddressID(addRS.getString("AddressID"));
    		address.setAddressNumber(addRS.getInt("AddressNo"));
    		address.setStreet(addRS.getString("Street"));
    		address.setCity(addRS.getString("City"));
    		address.setState(addRS.getString("State"));
    		address.setZip(addRS.getInt("Zip"));
    	}
    	//Close addRS 
    	addRS.close();
    	return address;
	}
	
	public void addAddress(Address address) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
	}
	
	public Room getRoom(String RoomID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
		Room r = new Room();
		return r;
	}
}
