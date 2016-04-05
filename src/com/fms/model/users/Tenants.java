package com.fms.model.users;


import org.springframework.beans.factory.annotation.Autowired;

public interface Tenants  {
    public int getTenID();
    @Autowired
    public void setTenID(int tenID);
    public boolean isPrimary();
    @Autowired
    public void setPrimary(boolean primary);
}
