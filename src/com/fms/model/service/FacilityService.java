package com.fms.model.service;
import com.fms.dal.*;
import com.fms.model.facility.*;

public class FacilityService {
	private FacilityDAO facDAO = new FacilityDAO();
	
	//search Buildings by ID from the DB
		public Building findBuildingById(String buildingID) {
				
			try {
				Building building = facDAO.getBuilding(buildingID);
		    	return building;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Building.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
		
		//Insert a new building in the DB
		public void addBuilding(Building b) {
			
			try {
				facDAO.addBuilding(b);
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception adding Building.");
		      System.err.println(se.getMessage());
		    }
		} 
		//search addresses by ID from the DB
		public Address findAddressById(String addressID) {
				
			try {
				Address address = facDAO.getAddress(addressID);
		    	return address;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Address.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}
		
		//Insert a new address in the DB
		public void addAddress(Address a) {
			
			try {
				facDAO.addAddress(a);
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception adding Address.");
		      System.err.println(se.getMessage());
		    }
		}
		//search rooms by ID from the DB
		public Room findRoomById(String roomID) {
				
			try {
				Room room = facDAO.getRoom(roomID);
		    	return room;
		    } catch (Exception se) {
		      System.err.println("FacilityService: Threw a Exception retrieving Room.");
		      System.err.println(se.getMessage());
		    }
			return null;
		}		
}
