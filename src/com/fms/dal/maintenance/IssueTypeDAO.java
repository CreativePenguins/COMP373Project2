package com.fms.dal.maintenance;

import com.fms.dal.HibernatePGSQLHelper;
import com.fms.model.maintenance.IssueType;
import com.fms.model.maintenance.IssueTypeImpl;
import org.hibernate.Session;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueTypeDAO {
    public IssueTypeDAO() {}

    public IssueTypeImpl getIssueType(int issueTypeID) {
        IssueTypeImpl t = new IssueTypeImpl();
        return t;
    }

    public void addIssueType(IssueType issuetype) {
        System.out.println("*************** Adding Issue in DB with ID..." + issuetype.getId());
        Session session = HibernatePGSQLHelper.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(issuetype);
        session.getTransaction().commit();
    }
}
