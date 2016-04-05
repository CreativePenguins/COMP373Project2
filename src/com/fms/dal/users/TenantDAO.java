package com.fms.dal.users;

import com.fms.dal.HibernatePGSQLHelper;
import com.fms.model.users.Tenants;
import com.fms.model.users.TenantsImpl;
import org.hibernate.Session;

public class TenantDAO {
	public TenantDAO(){};
	
	public Tenants getTenant(int tenantID)  {
		TenantsImpl tenants = new TenantsImpl();
		return tenants;
	}
	public /**ArrayList<Tenants>**/ int getTenants(){
		return 0;
	}
	public void addTenant(Tenants tenant)  {
		System.out.println("*************** Adding Issue in DB with ID..." + tenant.getTenID());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(tenant);
		session.getTransaction().commit();
	}

	public void deleteTenant(Tenants ten){
		System.out.println("*************** Deleteing customer information in DB with ID ...  " + ten.getTenID());
		Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(ten);
		session.getTransaction().commit();
	}
}
