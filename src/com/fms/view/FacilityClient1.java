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
import com.fms.model.service.*;
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
	ione.setRoomLocation(testBuilding.getRoom(201));
	ione.setComments("The sink in 201 has a leaky faucet.");
	ione.setBuildingLocation(testBuilding);
	System.out.println(ione.toString());
	
	System.out.println("\n-------------Adding Building, Address, and Rooms to Database------------");
	FacilityService facServ = new FacilityService();
	facServ.addAddress(testAddress);
	facServ.addBuilding(testBuilding);
	System.out.println("\n ------------------Retrieving Objects by ID------------------");
	Address newAddress = facServ.findAddressById("1");
	Building newBuilding = facServ.findBuildingById("1");
	Room newRoom = facServ.findRoomById("1100");
	
	System.out.println("\n-------------Adding Employees and Tenants to Database----------");
	UserService useServ = new UserService();
	useServ.addEmployee(one);
	useServ.addTenant(t2);
	System.out.println("\n-------------Retrieving Employees and Tenants by ID----------");
	Tenants newTenant = useServ.findTenantById("2");
	Employees newEmployee = useServ.findEmployeeById("1");
	
	System.out.println("\n-------------Adding Issues and IssueTypes to Database----------");
	MaintenanceService maintServ = new MaintenanceService();
	maintServ.addIssue(ione);
	maintServ.addIssueType(carp);
	System.out.println("\n-------------Retrieving Issues and IssueTypes by ID----------");
	maintServ.findIssueById("1");
	maintServ.FindIssueTypeByID("3");
	}
}
