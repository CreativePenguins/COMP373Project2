package com.fms.model.facility;

import com.fms.model.users.Tenants;

import java.util.ArrayList;

public interface Room {
	public int getRoomID();
	public void setRoomID(int roomID);
	public int getRoomNo();
	public void setRoomNo(int roomNo);
	public boolean isVacant();
	public void setVacant();
	public int getTenantNumber();
	public void addTenant(Tenants tenant);
	public ArrayList<Tenants> getTenants();
	public Tenants getPrimaryTenant();
	public void removeTenant(Tenants ten);
	public String toString();
}
