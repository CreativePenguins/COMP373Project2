package com.fms.dal.facility;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.helper.DBHelper;
import com.fms.model.facility.BuildingImpl;
import com.fms.model.facility.RoomImpl;

public class RoomDAO {
	public RoomDAO(){};
	
	public RoomImpl getRoom(int RoomID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
    	String selectRoomQuery = "SELECT room_id, roomno FROM room WHERE room_ID ='" + RoomID + "'";
    	
    	ResultSet roomRS = st.executeQuery(selectRoomQuery);
		RoomImpl r = new RoomImpl();
		while (roomRS.next()){
			r.setRoomID(roomRS.getInt("room_id"));
			r.setRoomNo(roomRS.getInt("roomno"));
		}
		return r;
	}
	public void addRoom(RoomImpl room, BuildingImpl building) throws SQLException, URISyntaxException{
		Connection con = DBHelper.getConnection();
		PreparedStatement roomPst = null;
	try{
		String rooStm = "INSERT INTO Room(roomid, roomno, buildingid) VALUES(?, ?, ?)";
		roomPst = con.prepareStatement(rooStm);
		roomPst.setInt(2, room.getRoomNo());
		roomPst.setInt(3, building.getBuildingID());
		roomPst.executeUpdate();
	} catch (SQLException ex) {System.out.println(ex);}
	}
}
