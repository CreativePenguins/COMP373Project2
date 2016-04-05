package com.fms.model.users;

import com.fms.model.maintenance.IssueType;
import org.springframework.beans.factory.annotation.Autowired;

public interface Employees {
    // Attributes
    public int getID();
    @Autowired
    public void setID(int ID);
    public int getMaxIssues();
    public IssueType getSpecialty1();
    @Autowired
    public void setSpecialty1(IssueType t);
    public IssueType getSpecialty2();
    @Autowired
    public void setSpecialty2(IssueType t);
    public IssueType getSpecialty3();
    @Autowired
    public void setSpecialty3(IssueType t);

}
