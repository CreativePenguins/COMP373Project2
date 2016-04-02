package com.fms.dal.facility;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.helper.DBHelper;
import com.fms.model.facility.Address;
import com.fms.model.facility.Building;
import com.fms.model.facility.Room;

public class BuildingDAO {
	public BuildingDAO(){};
	
	public Building getBuilding(String buildingID) throws SQLException, URISyntaxException{
		Statement st = DBHelper.getConnection().createStatement();
		AddressDAO ad = new AddressDAO();
		String selectBuildingQuery = "SELECT Building_ID, addressid FROM Building WHERE Building_ID = '" + buildingID + "'";
    	
		ResultSet builRS = st.executeQuery(selectBuildingQuery);
		
		//Get Building 
		Building building = new Building();
		String addressID = ""; 
		while (builRS.next() ){
			building.setBuildingID(builRS.getInt("Building_ID"));
			addressID = builRS.getString("AddressID");
		}
		Address a = ad.getAddress(addressID);
		
		building.setAddress(a);
		return building;
	}
	
	public void addBuilding (Building building) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
		AddressDAO ad = new AddressDAO();
		RoomDAO rd = new RoomDAO();
		PreparedStatement builPst = null;
		
		try {
			//Insert the Building object 
			String builStm = "INSERT INTO Building (addressid) VALUES(?, ?)";
			builPst = con.prepareStatement(builStm);
			builPst.setInt(2, building.getAddress().getAddressID());
			builPst.executeUpdate();
			//add the buildings address to the database
			ad.addAddress(building.getAddress());
			//add each room in the building to the database
			for (Room r: building.getRooms()){
				rd.addRoom(r, building);
			}
		} catch (SQLException ex){}
	}
}
