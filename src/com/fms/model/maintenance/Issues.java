package com.fms.model.maintenance;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Issues {

    // Attributes
    private String id;
    private String issueType;
    private String empID;
    private String comments;
    private String tenID;
    private String rmID;
    private String desc;
    private String date;

    // Accessors and Mutators

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTenID() {
        return tenID;
    }

    public void setTenID(String tenID) {
        this.tenID = tenID;
    }

    public String getRmID() {
        return rmID;
    }

    public void setRmID(String rmID) {
        this.rmID = rmID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean setDate() {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //get current date time with Date()
            Date d = new Date();
            date = dateFormat.format(d);
            return true;
    }

    public String getDate() {
        return date;
    }

}
