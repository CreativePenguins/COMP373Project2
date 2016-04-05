package com.fms.dal.maintenance;

import com.fms.model.maintenance.Issues;
import com.fms.model.maintenance.IssuesImpl;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueDAO {
    public IssueDAO() {
    }

    // TODO Retrieves issues from database.
    public IssuesImpl getIssue(int issueID) {
        IssuesImpl issue = new IssuesImpl();
        return issue;
    }

    // TODO Adds issues to database
    public void addIssue(Issues issue)  {
    }

    //TODO deletes issues in database
    public void deleteIssue(int IssueID){

    }
}