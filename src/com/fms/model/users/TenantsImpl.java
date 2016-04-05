package com.fms.model.users;


import org.springframework.beans.factory.annotation.Autowired;

public class TenantsImpl extends UsersImpl implements Tenants {

    // Attributes
    private int tenID; // Primary key
    private boolean primary;

    // Accessors and Mutators
    public TenantsImpl(){primary = false;}
    
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
