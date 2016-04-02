package com.fms.dal.facility;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.helper.DBHelper;
import com.fms.model.facility.Building;
import com.fms.model.facility.Room;

public class RoomDAO {
	public RoomDAO(){};
	
	public Room getRoom(String RoomID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
    	String selectRoomQuery = "SELECT room_id, roomno FROM room WHERE room_ID ='" + RoomID + "'";
    	
    	ResultSet roomRS = st.executeQuery(selectRoomQuery);
		Room r = new Room();
		while (roomRS.next()){
			r.setRoomID(roomRS.getInt("room_id"));
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
		roomPst.setInt(2, room.getRoomNo());
		roomPst.setInt(3, building.getBuildingID());
		roomPst.executeUpdate();
	} catch (SQLException ex) {System.out.println(ex);}
	}
}
