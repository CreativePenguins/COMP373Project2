package com.fms.dal.maintenance;

import java.net.URISyntaxException;
import java.sql.*;

import com.fms.dal.DBHelper;
import com.fms.model.maintenance.IssueType;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueTypeDAO {
    public IssueTypeDAO() {}

    public IssueType getIssueType(String issueTypeID) throws SQLException, URISyntaxException{
        try {
            Statement st = DBHelper.getConnection().createStatement();
            String selectIssTypeQuery = "SELECT typeid, description FROM issuetypes WHERE typeid = '" + issueTypeID + "'";

            ResultSet istRS = st.executeQuery(selectIssTypeQuery);
            System.out.println("IssTypeDAO: **************** Query " + selectIssTypeQuery);

            IssueType issueType = new IssueType();
            while (istRS.next()) {
                issueType.setId(istRS.getString("typeid"));
                issueType.setDescription(istRS.getString("description"));
            }
            istRS.close();
            st.close();
            return issueType;
        } catch (SQLException se) {
            System.err.println("IssueTypeDAO: Threw SQLException retrieving the issue type object.");
            System.err.println(se.getMessage());
        } return null;
    }

    public void addIssueType(IssueType issuetype) throws URISyntaxException, SQLException{
        Connection con = DBHelper.getConnection();
        PreparedStatement istyPst = null;

        try {
            String istyStm = "INSERT INTO issuetypes(typeid, description) VALUES(?, ?)";
            istyPst = con.prepareStatement(istyStm);
            istyPst.setString(1, issuetype.getId());
            istyPst.setString(2, issuetype.getDescription());
            istyPst.executeUpdate();
        } catch (SQLException ex) {System.out.println(ex);}
        finally {
            try{
                if (istyPst != null)
                    istyPst.close();
                if (con != null)
                    con.close();
            } catch (SQLException ex) {
                System.err.println("IsTyDAO: Threw a SQLExecp saving object");
                System.err.println(ex.getMessage());
            }
        }
    }
}
