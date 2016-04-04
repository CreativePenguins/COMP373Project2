package com.fms.model.users;

import com.fms.model.maintenance.IssueType;

import java.util.ArrayList;

public interface Employees {
    // Attributes
    public int getID();
    public void setID(int ID);
    public int getMaxIssues();
    public ArrayList<IssueType> getSpecialities();
    public IssueType getSpecialtyNum(int i);
    public int getSpecialtySize();
    public void addSpecialty(IssueType issueType);
}
