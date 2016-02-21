package com.fms.model.users;

public class Users {
	private String firstName;
	private String lastName;
	
	public Users(){}
	
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String toString(){
    	String s = "[" + lastName + ", " + firstName + "]";
    	return s;
    }
    
}
