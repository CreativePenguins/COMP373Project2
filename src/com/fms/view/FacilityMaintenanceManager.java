package com.fms.view;

import com.fms.model.facility.Building;
import com.fms.model.maintenance.Issues;

import java.util.ArrayList;

public class FacilityMaintenanceManager {
	
	public void makeFacilityMainRequest(){
		System.out.print("Making a Request...");
		//create new issue

	};
	public void calcMaintenanceCostForFacility(Building b){
		System.out.print("Calculating total maintenance cost for facility " + b.getBuildingID() + "...");
		//done by the employee
		//total cost of all issues that are closed
	};
	public void calcProblemRateForFacility(Building b){
		System.out.print("Calculating the problem rate for this facility " + b.getBuildingID() + "...");
		//problems per room per building
		//
	};
	public void calcDownTimeForFacility(Building b){
		System.out.print ("Calculating the amount of time left to resolve issues for building " + b.getBuildingID() + "...");
		//this is the amount of time left to resolve the issues
		int timeleft=0;
		ArrayList<Issues> i =  b.getIssues();
		for (Issues iss : i){
			if (!iss.getResolved()) timeleft+=iss.getEstimatedTime();
		}
		System.out.print("Total time left: " + timeleft);
	};
	public void listMaintRequests(Building b){
		System.out.print ("These are the open requests for building " + b.getBuildingID());
		//list the total list of open requests
		//list them all here
	};
	public void listMaintenance(Building b){
		System.out.print ("These are the closed maintenance issues for building " + b.getBuildingID());
		//list the total list of closed requests
	};
	public void listFacilityProblems(Building b){
		//get the total list of requests

	};
}
