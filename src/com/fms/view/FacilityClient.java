package com.fms.view;

import com.fms.model.service.FacilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class will employ the object classes and their methods
 * @author Tom and Tyler
 *
 */
public class FacilityClient {
	public static void main (String args[]) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		FacilityService facilityService = (FacilityService) context.getBean("facilityService");
	}
}
