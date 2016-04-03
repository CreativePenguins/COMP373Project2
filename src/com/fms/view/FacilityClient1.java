package com.fms.view;

import com.fms.model.facility.*;
import com.fms.model.maintenance.*;
import com.fms.model.users.*;
import com.fms.model.service.*;
import com.fms.view.*;
/**
 * This class will employ the object classes and their methods
 * @author Tom and Tyler
 *
 */
public class FacilityClient1 {
	public static void main (String args[]) throws Exception {

		FacilityClientManager fcm = new FacilityClientManager();

		//add a building into our database, works with user input to enter a new building into our database
		fcm.addNewFacility();

		//print each facility and their details
		fcm.listFacilites();

		//removes a building and their details from our database,
		// works with user input to determine which building we are trying to remove
		fcm.removeFacility();
	}
}
