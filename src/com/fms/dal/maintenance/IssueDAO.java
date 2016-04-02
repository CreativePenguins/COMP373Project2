package com.fms.dal.maintenance;

import java.net.URISyntaxException;
import java.sql.*;

import com.fms.dal.helper.DBHelper;
import com.fms.model.maintenance.Issues;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueDAO {
    public IssueDAO() {
    }

    // TODO Retrieves isses from database.
    public Issues getIssue(String issueID) throws SQLException, URISyntaxException {
        Issues i = new Issues();
        Statement st = DBHelper.getConnection().createStatement();
        return i;
    }

    // TODO Adds issues to database
    public void addIssue(Issues issue) throws URISyntaxException, SQLException {
        Connection con = DBHelper.getConnection();
    }


}