package com.fms.model.users;

import org.springframework.beans.factory.annotation.Autowired;

public interface Users {
    public String getFirstName();
    @Autowired
    public void setFirstName(String firstName);
    public String getLastName();
    @Autowired
    public void setLastName(String lastName);   
}
