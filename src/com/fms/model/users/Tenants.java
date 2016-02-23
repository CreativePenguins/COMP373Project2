package com.fms.model.users;


public class Tenants extends Users {

    // Attributes
    private String tenID; // Primary key
    private boolean primary;

    // Accessors and Mutators
    public Tenants(){primary = false;}
    
    public String getTenID() {
        return tenID;
    }

    public void setTenID(String tenID) {
        this.tenID = tenID;
    }

    public boolean isPrimary() {
        return primary;
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
