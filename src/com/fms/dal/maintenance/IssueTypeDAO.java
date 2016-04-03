package com.fms.dal.maintenance;

import java.net.URISyntaxException;
import java.sql.*;

import com.fms.dal.helper.DBHelper;
import com.fms.model.maintenance.IssueTypeImpl;

/**
 * Created by Tyler on 3/22/16.
 */
public class IssueTypeDAO {
    public IssueTypeDAO() {}

    public IssueTypeImpl getIssueType(int issueTypeID) throws SQLException, URISyntaxException{
        try {
            Statement st = DBHelper.getConnection().createStatement();
            String selectIssTypeQuery = "SELECT type_id, description FROM issuetypes WHERE type_id = '" + issueTypeID + "'";

            ResultSet istRS = st.executeQuery(selectIssTypeQuery);
            System.out.println("IssTypeDAO: **************** Query " + selectIssTypeQuery);

            IssueTypeImpl issueType = new IssueTypeImpl();
            while (istRS.next()) {
                issueType.setId(istRS.getInt("type_id"));
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

    public void addIssueType(IssueTypeImpl issuetype) throws URISyntaxException, SQLException{
        Connection con = DBHelper.getConnection();
        PreparedStatement istyPst = null;

        try {
            String istyStm = "INSERT INTO issuetypes(description) VALUES(?, ?)";
            istyPst = con.prepareStatement(istyStm);
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
