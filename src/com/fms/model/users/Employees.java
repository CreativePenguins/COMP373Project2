package com.fms.model.users;
import java.util.ArrayList;
import com.fms.model.maintenance.*; 

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
