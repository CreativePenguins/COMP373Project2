package com.fms.model.facility;

import org.springframework.beans.factory.annotation.Autowired;

public interface Address {
	public int getAddressID();
	@Autowired
	public void setAddressID(int addressID);
	public int getAddressNumber();
	@Autowired
	public void setAddressNumber(int addressNumber);
	public String getStreet();
	@Autowired
	public void setStreet(String street);
	public String getCity() ;
	@Autowired
	public void setCity(String city);
	public String getState();
	@Autowired
	public void setState(String state);
	public int getZip();
	@Autowired
	public void setZip(int zip);
	public String toString();
}
