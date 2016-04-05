package com.fms.model.users;

import com.fms.model.maintenance.IssueType;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeesImpl extends UsersImpl implements Employees  {

    // Attributes
    private int ID;
    private int maxIssues = 10;
    IssueType specialty1;
    IssueType specialty2;
    IssueType specialty3;

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

    @Autowired
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMaxIssues() {
        return maxIssues;
    }

    public IssueType getSpecialty1(){
        return specialty1;
    }

    @Autowired
    public void setSpecialty1(IssueType t){
        specialty1 = t;
    }
    public IssueType getSpecialty2(){
        return specialty2;
    }
    @Autowired
    public void setSpecialty2(IssueType t){
        specialty2 = t;
    }
    public IssueType getSpecialty3(){
        return specialty3;
    }
    @Autowired
    public void setSpecialty3(IssueType t){
        specialty3 = t;
    }

}
