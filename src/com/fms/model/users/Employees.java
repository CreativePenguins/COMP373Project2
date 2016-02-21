package com.fms.model.users;
import java.util.ArrayList;
import com.fms.model.maintenance.*; 

public class Employees extends Users {

    // Attributes
    private String ID;
    private int maxIssues = 10;
    private ArrayList<IssueType> specialities = new ArrayList<IssueType>();

    public Employees(){}
    
    // Accessors and mutators
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getMaxIssues() {
        return maxIssues;
    }

    public ArrayList<IssueType> getSpecialities() {
        return specialities;
    }

    public void addSpecialty(IssueType issueType) {
        specialities.add(issueType);
    }

}
