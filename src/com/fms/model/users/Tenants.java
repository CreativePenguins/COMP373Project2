package com.fms.model.users;


public class Tenants extends Users {

    // Attributes
    private String tenID; // Primary key
    private boolean primary;

    // Accessors and Mutators

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

}
