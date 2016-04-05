package com.fms.model.maintenance;

import org.springframework.beans.factory.annotation.Autowired;

public interface IssueType {
	public int getId() ;
    @Autowired
    public void setId(int id);
    public String getDescription();
    @Autowired
    public void setDescription(String desc);
}
