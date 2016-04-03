package com.fms.model.maintenance;

public class IssueTypeImpl {

    // Attributes
    private int id;
    private String description;

    // Constructors
    // Empty
    public IssueTypeImpl(){}

    // Filled
    public IssueTypeImpl(String description) {
        this.description = description;
    }

    // Accessor and mutators
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
}
