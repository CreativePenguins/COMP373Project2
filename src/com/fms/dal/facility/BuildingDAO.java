package com.fms.dal.facility;

import com.fms.model.facility.Building;
import org.hibernate.Query;
import org.hibernate.Session;
import com.fms.dal.HibernatePGSQLHelper;
import com.fms.model.facility.BuildingImpl;

import java.util.List;

public class BuildingDAO {
	public BuildingDAO(){};
	
	public BuildingImpl getBuilding(int buildingID) {
		System.out.println("*************** Searcing for customer address information with ID ...  " + customerId);
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		//Address billingAdd = (AddressImpl) session.load(AddressImpl.class, customerId);

		Query getAddresstQuery = session.createQuery("From AddressImpl where customerId=:customerId");
		getAddresstQuery.setString("customerId", customerId);

		System.out.println("*************** Retrieve Query is ....>>\n" + getAddresstQuery.toString());

		List addresses = getAddresstQuery.list();
		System.out.println("Getting Book Details using HQL. \n" + addresses.get(0));

		System.out.println("*************** Retrieve Query is ....>>\n" + addresses.get(0).toString());

		session.getTransaction().commit();
		return (Address)addresses.get(0);

	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}
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
