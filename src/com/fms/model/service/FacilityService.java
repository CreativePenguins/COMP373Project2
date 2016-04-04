package com.fms.model.service;

import com.fms.dal.facility.BuildingDAO;
import com.fms.model.facility.BuildingImpl;

public class FacilityService {
	//private AddressDAO addDAO = new AddressDAO();
	//private RoomDAO roomDAO = new RoomDAO();
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

		public void deleteBuilding(BuildingImpl b) {

		}
}
