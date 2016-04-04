package com.fms.model.users;

import com.fms.model.maintenance.IssueType;

import java.util.ArrayList;

public class EmployeesImpl extends UsersImpl implements Employees  {

    // Attributes
    private int ID;
    private int maxIssues = 10;
    private ArrayList<IssueType> specialities = new ArrayList<IssueType>();

    // Constructor
    public EmployeesImpl(){}

    public EmployeesImpl(String first, String last) {
        super.setFirstName(first);
        setLastName(last);
    }
    // Accessors and mutators
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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
