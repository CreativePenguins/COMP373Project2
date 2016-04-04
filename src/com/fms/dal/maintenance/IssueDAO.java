package com.fms.dal.maintenance;

import com.fms.dal.helper.DBHelper;
import com.fms.model.maintenance.Issues;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueDAO {
    public IssueDAO() {
    }

    // TODO Retrieves isses from database.
    public int getIssue(int issueID) throws SQLException, URISyntaxException {
        //Issues i = new Issues();
        Statement st = DBHelper.getConnection().createStatement();
        return issueID;
    }

    // TODO Adds issues to database
    public void addIssue(Issues issue) throws URISyntaxException, SQLException {
        Connection con = DBHelper.getConnection();
    }
}