package com.fms.model.users;


public class Tenants {

    // Attributes
    private String tenID;
    private boolean primary;
    private String firstName;
    private String lastName;
    private int roomNumber; // Not the ID, but will be in format [Floor|Rm#]

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

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
