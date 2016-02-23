package com.fms.model.maintenance;

public class IssueType {

    // Attributes
    private String id;
    private String description;

    // Constructors
    // Empty
    public IssueType(){}

    // Filled
    public IssueType(String description, String id) {
        this.description = description;
        this.id = id;
    }

    // Accessor and mutators
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }
}
