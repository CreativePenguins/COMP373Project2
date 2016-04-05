package com.fms.dal.facility;

import com.fms.dal.HibernatePGSQLHelper;
import com.fms.model.facility.Building;
import com.fms.model.facility.BuildingImpl;
import org.hibernate.Session;

public class BuildingDAO {
	public BuildingDAO(){};
	
	public BuildingImpl getBuilding(int buildingID) {
		BuildingImpl b = new BuildingImpl();
		return b;
	}

	public /**ArrayList<Building>**/ int getBuildings(){
		return 0;
	}
	public void addBuilding (Building building) {
		System.out.println("*************** Adding Building in DB with ID ...  " + building.getBuildingID());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(building);
		session.getTransaction().commit();
	}

	public void deleteBuilding (Building bID){
		System.out.println("*************** Deleting customer information in DB with ID ...  " + bID.getBuildingID());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(bID);
		session.getTransaction().commit();
	}
}
