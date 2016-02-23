package com.fms.dal;
import java.sql.Statement;

import com.fms.model.facility.*;
import com.fms.dal.*;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FacilityDAO {
	public FacilityDAO(){}
	
	public Building getBuilding(String buildingID) throws SQLException, URISyntaxException{
		Statement st = DBHelper.getConnection().createStatement();
		String selectBuildingQuery = "SELECT BuildingID, addressid FROM Building WHERE BuildingID = '" + buildingID + "'";
    	
		ResultSet builRS = st.executeQuery(selectBuildingQuery);
		
		//Get Building 
		Building building = new Building();
		String addressID = ""; 
		while (builRS.next() ){
			building.setBuildingID(builRS.getString("BuildingID"));
			addressID = builRS.getString("AddressID");
		}
		Address a = getAddress(addressID);
		
		building.setAddress(a);
		return building;
	}
	
	public void addBuilding (Building building) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
		PreparedStatement builPst = null;
		
		try {
			//Insert the Building object 
			String builStm = "INSERT INTO Building (buildingid, addressid) VALUES(?, ?)";
			builPst = con.prepareStatement(builStm);
			builPst.setString(1,  building.getBuildingID());
			builPst.setString(2, building.getAddress().getAddressID());
			builPst.executeUpdate();
			//add the buildings address to the database
			addAddress(building.getAddress());
			//add each room in the building to the database
			for (Room r: building.getRooms()){
				addRoom(r, building);
			}
		} catch (SQLException ex){}
	}
	
	public Address getAddress(String addressID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
    	String selectAddressQuery = "SELECT AddressID, AddressNo, Street, City, State, Zip FROM Address WHERE AddressID ='" + addressID + "'";
    	
    	ResultSet addRS = st.executeQuery(selectAddressQuery);
    	
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
		PreparedStatement addPst = null;
		
		try{
		String addStm = "INSERT INTO Address(addressid, addressno, street, city, state, zip) VALUES(?, ?, ?, ?, ?, ?)";
		addPst = con.prepareStatement(addStm);
		addPst.setString(1,  address.getAddressID());
		addPst.setInt(2, address.getAddressNumber());
		addPst.setString(3, address.getStreet());
		addPst.setString(4, address.getCity());
		addPst.setString(5, address.getState());
		addPst.setInt(6, address.getZip());
		addPst.executeUpdate();
		} catch (SQLException ex) { System.out.println(ex);
			
		} finally {
			try{
				if (addPst !=null){
					addPst.close();	
				}
				if (con!=null){
					con.close();
				}
			} catch (SQLException ex) {
				System.err.println("FacilityDAO: Threw a SQLException saving the customer object.");
			}
		}
		System.out.println("FacilityDAO: addAddress ran successfully");
	}
	
	public Room getRoom(String RoomID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
    	String selectRoomQuery = "SELECT roomid, roomno FROM room WHERE roomID ='" + RoomID + "'";
    	
    	ResultSet roomRS = st.executeQuery(selectRoomQuery);
		Room r = new Room();
		while (roomRS.next()){
			r.setRoomID(roomRS.getString("roomid"));
			r.setRoomNo(roomRS.getInt("roomno"));
		}
		return r;
	}
	public void addRoom(Room room, Building building) throws SQLException, URISyntaxException{
		Connection con = DBHelper.getConnection();
		PreparedStatement roomPst = null;
	try{
		String rooStm = "INSERT INTO Room(roomid, roomno, buildingid) VALUES(?, ?, ?)";
		roomPst = con.prepareStatement(rooStm);
		roomPst.setString(1, room.getRoomID());
		roomPst.setInt(2, room.getRoomNo());
		roomPst.setString(3, building.getBuildingID());
		roomPst.executeUpdate();
	} catch (SQLException ex) {System.out.println(ex);}
	}
}
