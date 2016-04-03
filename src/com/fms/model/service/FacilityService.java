package com.fms.model.service;
import com.fms.dal.facility.*;
import com.fms.model.facility.*;

public class FacilityService {
	private AddressDAO addDAO = new AddressDAO();
	private RoomDAO roomDAO = new RoomDAO();
	private BuildingDAO buiDAO = new BuildingDAO();
	
	//search Buildings by ID from the DB
		public BuildingImpl findBuildingById(int buildingID) {
				
			try {
				BuildingImpl building = buiDAO.getBuilding(buildingID);
		    	return building;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Building.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
		
		//Insert a new building in the DB
		public void addBuilding(BuildingImpl b) {
			
			try {
				buiDAO.addBuilding(b);
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception adding Building.");
		      System.err.println(se.getMessage());
		    }
		} 
		//search addresses by ID from the DB
		public AddressImpl findAddressById(int addressID) {
				
			try {
				AddressImpl address = addDAO.getAddress(addressID);
		    	return address;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Address.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
		
		//Insert a new address in the DB
		public void addAddress(AddressImpl a) {
			
			try {
				addDAO.addAddress(a);
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception adding Address.");
		      System.err.println(se.getMessage());
		    }
		}
		//search rooms by ID from the DB
		public RoomImpl findRoomById(int roomID) {
				
			try {
				RoomImpl room = roomDAO.getRoom(roomID);
		    	return room;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Room.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}		
}
