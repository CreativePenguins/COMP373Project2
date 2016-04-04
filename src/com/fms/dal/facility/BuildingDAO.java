package com.fms.dal.facility;

import com.fms.dal.helper.DBHelper;
import com.fms.model.facility.BuildingImpl;

import java.net.URISyntaxException;
import java.sql.*;

public class BuildingDAO {
	public BuildingDAO(){};
	
	public BuildingImpl getBuilding(int buildingID) throws SQLException, URISyntaxException{
		Statement st = DBHelper.getConnection().createStatement();
		//AddressDAO ad = new AddressDAO();
		String selectBuildingQuery = "SELECT Building_ID, addressid FROM Building WHERE Building_ID = '" + buildingID + "'";
    	
		ResultSet builRS = st.executeQuery(selectBuildingQuery);
		
		//Get Building 
		BuildingImpl building = new BuildingImpl();
		String addressID = ""; 
		while (builRS.next() ){
			building.setBuildingID(builRS.getInt("Building_ID"));
			addressID = builRS.getString("AddressID");
		}
		//AddressImpl a = ad.getAddress(addressID);
		
		//building.setAddress(a);
		return building;
	}
	
	public void addBuilding (BuildingImpl building) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
		//AddressDAO ad = new AddressDAO();
		//RoomDAO rd = new RoomDAO();
		PreparedStatement builPst = null;
		
		try {
			//Insert the Building object 
			String builStm = "INSERT INTO Building (addressid) VALUES(?, ?)";
			builPst = con.prepareStatement(builStm);
			builPst.setInt(2, building.getAddress().getAddressID());
			builPst.executeUpdate();
			//add the buildings address to the database
			//ad.addAddress(building.getAddress());
			//add each room in the building to the database
			//for (RoomImpl r: building.getRooms()){
				//rd.addRoom(r, building);
			//}
		} catch (SQLException ex){}
	}
}
