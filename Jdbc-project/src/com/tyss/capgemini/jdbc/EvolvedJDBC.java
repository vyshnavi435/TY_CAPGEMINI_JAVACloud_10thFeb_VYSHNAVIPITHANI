package com.tyss.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;


public class EvolvedJDBC {

	public static void main(String[] args) {
		// Load the driver
		try {
			// Driver driver = new com.mysql.jdbc.Driver()
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch(Exception e){
			e.printStackTrace();
		}
			

		
	

	String dburl = "jdbc:mysql://localhost:3306/caps_cloud";
	String user = "root";
	String password = "vyshu";
	String query = "select * from user_info";
	// Get DB connection via Driver
	// Issue SQL Queries via connection
	
	try(
	Connection connection = DriverManager.getConnection(dburl, user, password);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(query))
	{
		// Process the results return by SQL queries
		while (resultSet.next()) {
			System.out.println("Userid:" + resultSet.getInt("userid"));
			System.out.println("UserName: " + resultSet.getString(2));
			System.out.println("Email: " + resultSet.getString("email"));
			System.out.println("password:*************");
			System.out.println("++++++++++++++++++++++++++++");

		}

	}

	catch(SQLException e)
	{
		e.printStackTrace();
	}
	// close all JDBC objects
 }
}




