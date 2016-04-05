package com.fms.dal.maintenance;

import com.fms.dal.HibernatePGSQLHelper;
import com.fms.model.maintenance.Issues;
import com.fms.model.maintenance.IssuesImpl;
import org.hibernate.Session;

/**
 * Created by Tyler and Tom on 3/22/16.
 */

public class IssueDAO {
    public IssueDAO() {
    }

    // TODO Retrieves issues from database.
    public IssuesImpl getIssue(int issueID) {
        IssuesImpl issue = new IssuesImpl();
        return issue;
    }
    public /**ArrayList<Issues> **/ int getIssues(){
        return 0;
    }
    // TODO Adds issues to database
    public void addIssue(Issues issue)  {
        System.out.println("*************** Adding Issue in DB with ID..." + issue.getIssueId());
        Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(issue);
        session.getTransaction().commit();
    }

    //TODO deletes issues in database
    public void deleteIssue(Issues issues){
        System.out.println("*************** Deleting customer information in DB with ID ...  " + issues.getIssueId());
        Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(issues);
        session.getTransaction().commit();
    }
}