package com.fms.model.users;
import java.util.ArrayList;
import com.fms.model.maintenance.*; 

public class Employees extends Users {

    // Attributes
    private String ID;
    private int maxIssues = 10;
    private ArrayList<IssueType> specialities = new ArrayList<IssueType>();

    // Constructor
    public Employees(){}

    public Employees(String first, String last, String id) {
        setFirstName(first);
        setLastName(last);
        setID(id);
    }
    
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

    public IssueType getSpecialtyNum(int i) {
        return specialities.get(i);
    }

    public int getSpecialtySize() {
        return specialities.size();
    }

    public void addSpecialty(IssueType issueType) {
        specialities.add(issueType);
    }

}
