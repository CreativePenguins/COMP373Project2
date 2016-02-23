package com.fms.dal;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;

/**
 * Helper class for connecting to AWS MySQL DB.
 */
public class DBHelper {
	
	public static Connection getConnection() throws URISyntaxException, SQLException {
		URI dbUri = new URI(("postgres://nxuofibqoygxqn:WQSlQYEoizmu2wlrSD-ncVCzZG@ec2-54-83-198-111.compute-1.amazonaws.com:5432/d73f7ijqb8stbu"));

		String username = dbUri.getUserInfo().split(":")[0];
		String password = dbUri.getUserInfo().split(":")[1];
		String dbUrl = "jdbc:postgresql://"+ dbUri.getHost()+ ":" + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

	    return DriverManager.getConnection(dbUrl, username, password);
	}

}
