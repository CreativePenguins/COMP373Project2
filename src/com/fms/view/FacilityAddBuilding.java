package com.fms.view;

import com.fms.model.facility.Address;
import com.fms.model.facility.Building;
import com.fms.model.service.FacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class will employ the object classes and their methods
 * @author Tom and Tyler
 *
 */
public class FacilityAddBuilding {
	public static void main (String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");

		System.out.println("*#*#*#*#*#*#*# CREATING BUILDING #*#*#*#*#*#*#*");
		Building building = (Building) context.getBean("building");
		Address address = (Address) context.getBean("address");
		address.setAddressID(1);
		address.setAddressNumber(401);
		address.setStreet("N Michigan Ave");
		address.setCity("Chicago");
		address.setState("IL");
		address.setZip(60611);
		building.setAddress(address);

		System.out.println("*#*#*#*#*#*#*# INSERTING INTO TABLE #*#*#*#*#*#*#*");
		facilityService.addBuilding(building);
	}
}
