package com.fms.model.users;


public class Tenants {

    // Attributes
    private String tenID; // Primary key
    private boolean primary;
    private String firstName;
    private String lastName;

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
}
