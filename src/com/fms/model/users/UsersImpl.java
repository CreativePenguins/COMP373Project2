package com.fms.model.users;

import org.springframework.beans.factory.annotation.Autowired;

public class UsersImpl implements Users {
	private String firstName;
	private String lastName;
	
	public UsersImpl(){}
	
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
