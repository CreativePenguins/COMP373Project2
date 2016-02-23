package com.fms.view;

import com.fms.model.facility.*;
import com.fms.model.maintenance.*;
import com.fms.model.users.*;
import com.fms.dal.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class will employ the object classes and their methods
 * @author Tom and Tyler
 *
 */
public class FacilityClient1 {
	public static void main (String args[]) throws Exception {

		// Instantiating issue types
		IssueType plumb = new IssueType("Plumbing", "1");
		IssueType elec = new IssueType("Electrical", "2");
		IssueType carp = new IssueType("Carpentry", "3");

		// Instantiating employees
		Employees one = new Employees("John", "Smith", "1");
		Employees two = new Employees("George", "Townsend", "2");

		// Adding specialties to employees
		one.addSpecialty(plumb);
		two.addSpecialty(elec);
		two.addSpecialty(carp);


	//instantiating objects and using methods in Facility
	Address testAddress = new Address ();
	testAddress.setAddressID("1");
	testAddress.setAddressNumber(6459);
	testAddress.setStreet("North Magnolia Ave");
	testAddress.setCity("Chicago");
	testAddress.setState("Illinois");
	testAddress.setZip(49120);

	Building testBuilding = new Building("1", 2, 2, testAddress);

	//instantiating objects and using methods in Users
	Tenants t1 = new Tenants();
	Tenants t2 = new Tenants();
	t1.setFirstName("Tom");
	t1.setLastName("Brown");
	t1.setTenID("1");
	t2.setFirstName("Tyler");
	t2.setLastName("Pearson");
	t2.setTenID("2");
	t2.setPrimary(true);

	testBuilding.addTenantToRoom(t1, 201);
	testBuilding.addTenantToRoom(t2, 201);
	System.out.println(testBuilding.toString());
		System.out.println();

		// Create issue
		Issues ione = new Issues();
		ione.setIssueid("1");
		ione.setIssueType(plumb);
		ione.setAssignee(one);
		ione.setRoomLocation(testBuilding.getRoom(3));
		ione.setComments("The sink in 201 has a leaky faucet.");
		ione.setBuildingLocation(testBuilding);
		System.out.println(ione.toString());

	//instantiating objects and using methods in Maintenance
	}
}
