package com.fms.model.facility;

public interface Address {
	public int getAddressID();
	public void setAddressID(int addressID);
	public int getAddressNumber();
	public void setAddressNumber(int addressNumber);
	public String getStreet();
	public void setStreet(String street);
	public String getCity() ;
	public void setCity(String city);
	public String getState();
	public void setState(String state);
	public int getZip();
	public void setZip(int zip);
	public String toString();
}
