package com.fms.model.users;


public class Tenants extends Users {

    // Attributes
    private String tenID; // Primary key
    private boolean primary;

    // Accessors and Mutators
    public Tenants(){}
    
    public String getTenID() {
        return tenID;
    }

    public void setTenID(String tenID) {
        this.tenID = tenID;
    }

    public char isPrimary() {
        if(primary == true)
            return 't';
        else
            return 'f';
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }
    @Override
    public String toString(){
    	String s = super.toString();
    	if (primary){
    		s = s.replace("]", " : Primary Tenant]");
    	}
    	return s;
    }
}
