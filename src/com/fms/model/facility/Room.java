package com.fms.model.facility;

import com.fms.model.users.Tenants;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public interface Room {
	public int getRoomID();
	@Autowired
	public void setRoomID(int roomID);
	public int getRoomNo();
	@Autowired
	public void setRoomNo(int roomNo);
	public boolean isVacant();
	@Autowired
	public void setVacant();
	public int getTenantNumber();
	public void addTenant(Tenants tenant);
	public ArrayList<Tenants> getTenants();
	public Tenants getPrimaryTenant();
	public void removeTenant(Tenants ten);
	public String toString();
}
