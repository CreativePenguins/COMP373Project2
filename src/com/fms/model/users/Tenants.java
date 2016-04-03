package com.fms.model.users;


public interface Tenants  {
    public int getTenID();
    public void setTenID(int tenID);
    public boolean isPrimary();
    public void setPrimary(boolean primary);
}
