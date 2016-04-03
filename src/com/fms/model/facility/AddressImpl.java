package com.fms.model.facility;

public class AddressImpl implements Address{
	private int AddressID;
	private int addressNumber;
	private String street; 
	private String city; 
	private String state; 
	private int zip; 
	
	public AddressImpl(int a, String s, String c, String st, int z)
	{
		addressNumber = a;
		street = s; 
		city = c;
		state = st;
		zip =z;
	}
	public AddressImpl (){}
	
	public int getAddressID() {
		return AddressID;
	}

	public void setAddressID(int addressID) {
		AddressID = addressID;
	}

	public int getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	public String toString(){
		return (addressNumber + " " + street + " \n" + city + " " + state + " " + zip);
	}
	
}
