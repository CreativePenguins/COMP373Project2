package com.fms.view;

import com.fms.model.facility.Building;
import com.fms.model.service.FacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tyler on 4/4/16.
 */
public class FacilityRmBuilding {
    public static void main (String args[]) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
        System.out.println("*#*#*#*#*#*#*# CONTEXT CREATED #*#*#*#*#*#*#*");
        FacilityService facilityService = (FacilityService) context.getBean("facilityService");

        System.out.println("*#*#*#*#*#*#*# DELETING BUILDING #*#*#*#*#*#*#*");

        Building building;
        /*Building building = facilityService.*/ // I can't find a building until that is implemented...

        System.out.println("Building to be deleted...");
        System.out.println("\t LOCATION: \t\t" + building.getAddress().toString();

        facilityService.deleteBuilding(building);
    }
}
}
