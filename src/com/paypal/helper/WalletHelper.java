package com.paypal.helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.paypal.model.CacheMemory;
import com.paypal.model.DAOImpl;

public class WalletHelper 
{

	String query = null;
	String result = "";
	DAOImpl dao = new DAOImpl();
	
	public String getWalletBalance()
	{
		query = "SELECT balance from paypallogin where username = ?";
		
		try {
			
			PreparedStatement psmt = dao.getConnection().prepareStatement(query);
			psmt.setString(1, CacheMemory.loggedUsername);
			
			ResultSet rs = dao.selectData(psmt);
			
			if(rs.next())
				result = rs.getString(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
