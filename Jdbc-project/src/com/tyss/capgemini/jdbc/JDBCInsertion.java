package com.tyss.capgemini.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class JDBCInsertion {
	
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement = null;
		Scanner scanner = new Scanner(System.in);
		// load the driver
		try {
			Driver driver = new com.mysql.jdbc.Driver(); //register the driver 
		
		  
		// Get the DB Connection via driver
		String dburl ="jdbc:mysql://localhost:3306/caps_cloud" + "?user=root&password=vyshu";
		connection = DriverManager.getConnection(dburl);
		System.out.println("conn end");
		//issues the Sql Queries via connection
		String query = "insert into user_info values(?,?,?,?)";
		preparedStatement = connection.prepareStatement(query);
		
		
		System.out.println("enter the userid");
		preparedStatement.setInt(1, Integer.parseInt(scanner.nextLine()));
		
		System.out.println("enter the userName");
		preparedStatement.setString(2, scanner.nextLine());
		
		System.out.println("enter email");
		preparedStatement.setString(3, scanner.nextLine());
		
		System.out.println("enter password");
		preparedStatement.setString(4, scanner.nextLine());
		
		int count = preparedStatement.executeUpdate();
		//process the result returned by SQL quries
		if(count > 0) {
			System.out.println("Query ok, " + count+ "row(s) affected");
		} else {
			System.out.println("something went wrong");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		if(connection != null) {
			try {
				connection.close();
			}catch(SQLException e){
				e.printStackTrace();
				
			}
		}
		if(preparedStatement != null) {
			try {
				preparedStatement.close();
			}catch(SQLException e){
				e.printStackTrace();
				
			}
		}
	}
scanner.close();
}
}