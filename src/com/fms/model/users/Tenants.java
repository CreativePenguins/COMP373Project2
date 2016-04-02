package com.fms.model.users;


public class Tenants extends Users {

    // Attributes
    private int tenID; // Primary key
    private boolean primary;

    // Accessors and Mutators
    public Tenants(){primary = false;}
    
    public int getTenID() {
        return tenID;
    }

    public void setTenID(int tenID) {
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
