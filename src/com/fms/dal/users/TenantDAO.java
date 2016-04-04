package com.fms.dal.users;

import com.fms.model.users.Tenants;
import com.fms.model.users.TenantsImpl;

public class TenantDAO {
	public TenantDAO(){};
	
	public Tenants getTenant(int tenantID)  {
		TenantsImpl tenants = new TenantsImpl();
		return tenants;
	}
	
	public void addTenant(Tenants tenant)  {

	}

	public void deleteTenant(int tenantID){

	}
}
