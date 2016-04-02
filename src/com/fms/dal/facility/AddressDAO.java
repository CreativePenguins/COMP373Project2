package com.fms.dal.facility;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fms.dal.DBHelper;
import com.fms.model.facility.Address;

public class AddressDAO {
	public AddressDAO(){};
	
	public Address getAddress(String addressID) throws SQLException, URISyntaxException{
    	Statement st = DBHelper.getConnection().createStatement();
    	String selectAddressQuery = "SELECT AddressID, AddressNo, Street, City, State, Zip FROM Address WHERE AddressID ='" + addressID + "'";
    	
    	ResultSet addRS = st.executeQuery(selectAddressQuery);
    	
    	//Get Address 
    	Address address = new Address();
    	while (addRS.next()){
    		address.setAddressID(addRS.getString("AddressID"));
    		address.setAddressNumber(addRS.getInt("AddressNo"));
    		address.setStreet(addRS.getString("Street"));
    		address.setCity(addRS.getString("City"));
    		address.setState(addRS.getString("State"));
    		address.setZip(addRS.getInt("Zip"));
    	}
    	//Close addRS 
    	addRS.close();
    	return address;
	}
	
	public void addAddress(Address address) throws URISyntaxException, SQLException{
		Connection con = DBHelper.getConnection();
		PreparedStatement addPst = null;
		
		try{
		String addStm = "INSERT INTO Address(addressid, addressno, street, city, state, zip) VALUES(?, ?, ?, ?, ?, ?)";
		addPst = con.prepareStatement(addStm);
		addPst.setString(1,  address.getAddressID());
		addPst.setInt(2, address.getAddressNumber());
		addPst.setString(3, address.getStreet());
		addPst.setString(4, address.getCity());
		addPst.setString(5, address.getState());
		addPst.setInt(6, address.getZip());
		addPst.executeUpdate();
		} catch (SQLException ex) { System.out.println(ex);
			
		} finally {
			try{
				if (addPst !=null){
					addPst.close();	
				}
				if (con!=null){
					con.close();
				}
			} catch (SQLException ex) {
				System.err.println("FacilityDAO: Threw a SQLException saving the customer object.");
			}
		}
		System.out.println("FacilityDAO: addAddress ran successfully");
	}
}
