package com.paypal.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOImpl 
{

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbUsername = "endless";
	private static String dbPassword = "root";
	private static Connection con = null;
	private static Statement smt = null;
	private static PreparedStatement psmt = null;
	private static String query = null;
	private static ResultSet rs = null;
	
	public DAOImpl()
	{
		getConnection();
	}
	
	public void getConnection()
	{
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			smt = con.createStatement();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertData(int id, String user, String pswd)
	{
		query = "INSERT INTO paypal VALUES(?,?,?)";
		
		try {
			
			psmt = con.prepareStatement(query);
			
			psmt.setInt(1, id);
			psmt.setString(2, user);
			psmt.setString(3, pswd);
			
			System.out.println("Inserted rows : " + psmt.executeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateData(int id, String pswd)
	{
		query = "UPDATE paypal SET password = ? where id = ?";
		
		try {
			
			psmt = con.prepareStatement(query);
			
			psmt.setString(1, pswd);
			psmt.setInt(2, id);
			
			System.out.println("Updated rows : " + psmt.executeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteData(int id)
	{
		query = "DELETE FROM paypal where id = ?";
		
		try {
			
			psmt = con.prepareStatement(query);
			
			psmt.setInt(1, id);
			
			System.out.println("Deleted rows : " + psmt.executeUpdate());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void selectData()
	{
		query = "SELECT id, username, password FROM paypal";
		
		try {
			
			rs = smt.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConnection()
	{
		try {
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
