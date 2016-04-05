package com.fms.model.users;

import com.fms.model.maintenance.IssueType;

public interface Employees {
    // Attributes
    public int getID();
    public void setID(int ID);
    public int getMaxIssues();
    public IssueType getSpecialty1();
    public void setSpecialty1(IssueType t);
    public IssueType getSpecialty2();
    public void setSpecialty2(IssueType t);
    public IssueType getSpecialty3();
    public void setSpecialty3(IssueType t);

}
