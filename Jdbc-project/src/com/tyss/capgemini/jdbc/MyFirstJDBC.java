package com.tyss.capgemini.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);

			// Get the DB connection via Driver
			String dburl = "jdbc:mysql://localhost:3306/caps_cloud?user=root&password=vyshu";
			connection = DriverManager.getConnection(dburl);
			System.out.println("Connection established");
			System.out.println("************************");

			// Issue the SQL Queries via connection
			String query = "select * from user_info";
			statement=connection.createStatement();
			resultSet = statement.executeQuery(query);
			// Process the Result Returned by SQL Queries
			while (resultSet.next()) {
				System.out.println("Userid:" + resultSet.getInt("userid"));
				System.out.println("UserName: " + resultSet.getString(2));
				System.out.println("Email: " + resultSet.getString("email"));
				System.out.println("password:*************");
				System.out.println("++++++++++++++++++++++++++++");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// close all the JDBC objects
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
