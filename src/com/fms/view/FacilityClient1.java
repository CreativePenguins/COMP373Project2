package com.fms.view;

import com.fms.model.facility.*;
import com.fms.model.maintenance.*;
import com.fms.model.users.*;

/**
 * This class will employ the object classes and their methods
 * @author Tom and Tyler
 *
 */
public class FacilityClient1 {
	public static void main (String args[]) throws Exception {

		// TODO create issue types
		// TODO create employees - Set ID
		// TODO Add specialties to empoloyee
		// TODO create issue

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
	//instantiating objects and using methods in Maintenance
	}
}
