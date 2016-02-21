package com.fms.model.users;
import java.util.ArrayList;
import java.util.List;
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

    public void setMaxIssues(int maxIssues) {
        this.maxIssues = maxIssues;
    }

    public String getIssueTypesID() {
        return issueTypesID;
    }

    public void setIssueTypesID(String issueTypesID) {
        this.issueTypesID = issueTypesID;
    }

}
