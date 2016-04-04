package com.fms.view;

import com.fms.model.facility.Building;
import com.fms.model.facility.Room;

import java.util.ArrayList;

public class FacilityClientManager {
	FacilityClientManager(){};
	
	//TODO define what each of these methods are accomplishing and code them
	//this class will talk to the service class
	public void listFacilites(){
		//pulls all the buildings from our database and assigns them to list
		//for each building we need to
		//list how many rooms each building has, and their address by invoking get facilityinformation is evoked inside this method
	}
	public void getFacilityInformation(Building b){
		// this method will print how many rooms each building has, the buildings address
		//invokes request available capacity method for each room
	};
	public int requestAvailableCapacity(ArrayList<Room> r){
		//pass in a list of rooms and return an integer that represents how many empty rooms in the list
		int count = 0;
		for (Room room: r){
			if (room.isVacant()) count++;
		}
		return count;
	};
	public void addNewFacility(){
		//this will create a new facility
	};
	public void addFacilityDetail(){
		//this will add a detail to a facility
		//can update address , add detail, add tenant
	};
	public void removeFacility(){};
}
