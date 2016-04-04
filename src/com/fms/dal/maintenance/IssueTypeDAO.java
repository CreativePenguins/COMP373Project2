package com.fms.dal.maintenance;

import com.fms.model.maintenance.IssueTypeImpl;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueTypeDAO {
    public IssueTypeDAO() {}

    public IssueTypeImpl getIssueType(int issueTypeID) {
        IssueTypeImpl t = new IssueTypeImpl();
        return t;
    }

    public void addIssueType(IssueTypeImpl issuetype) {

    }
}
