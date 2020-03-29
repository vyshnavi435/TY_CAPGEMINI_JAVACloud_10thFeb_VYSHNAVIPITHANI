package com.tyss.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.tyss.capgemini.jdbc.beans.User;

public class UserDAOImpl implements UserDAO {
	User user;
	Properties properties;

	public UserDAOImpl() {

		try {
			properties = new Properties();
			properties.load(new FileReader("application.properties"));
			Class.forName(properties.getProperty("driverClass")).newInstance();

			// Class.forName("com.mysql.jdbc.Driver").newInstance(); // hardcorder we need
			// to work with all different type of data
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// get the con try with resource and catch

	@Override
	public List<User> getAllUsers() {
		
		List<User> userList = new ArrayList<User>();
		
		try (Connection connection = DriverManager.getConnection(properties.getProperty("dbUrl"),
				properties.getProperty("dbUser"), properties.getProperty("dbPassword"));
				Statement statement = connection.createStatement();
				ResultSet resultset = statement.executeQuery(properties.getProperty("selectAllQuery"))) {
			while (resultset.next()) {
				user = new User();
				user.setUserid(resultset.getInt("userid"));
				user.setUsername(resultset.getString("username"));
				user.setEmail(resultset.getString("email"));
				user.setPassword(resultset.getString("password"));
				userList.add(user);
			}
			return userList; // after statement get execute query due to select statement
			                              // we just need while loop to process the result

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}



	@Override
	public boolean updateEmail(int userid, String password, String email) {
		
		try (Connection connection = DriverManager.getConnection(properties.getProperty("dbUrl"),
				properties.getProperty("dbUser"), properties.getProperty("dbPassword"));
				PreparedStatement preparedStatement = connection
						.prepareStatement(properties.getProperty("insertUser"))) {
			
			preparedStatement.setInt(1, user.getUserid());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			
			int count = preparedStatement.executeUpdate();
			
			if (count > 0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
         return false;
	}
	

	@Override
	public boolean deleteUser(int userid, String password) {
		try (Connection connection = DriverManager.getConnection(properties.getProperty("dbUrl"),
				properties.getProperty("dbUser"), properties.getProperty("dbPassword"));
			   PreparedStatement preparedstatement = connection.prepareStatement(properties.getProperty("deleteUser")) 
			)
			
		{
			preparedstatement.setInt(1,userid);
			preparedstatement.setString(2,password);
			
			int count = preparedstatement.executeUpdate();
			if(count > 0) {
				return true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;	
		}

	

	@Override
	public User getUser(int userid) {
		try (Connection connection = DriverManager.getConnection(properties.getProperty("dbUrl"),
				properties.getProperty("dbUser"), properties.getProperty("dbPassword"));
				PreparedStatement preparedStatement = connection
						.prepareStatement(properties.getProperty("selectUser"))) {
			preparedStatement.setInt(1, userid);
		try(ResultSet resultSet = preparedStatement.executeQuery()){
			if (resultSet.next()) {
				user = new User();
				user.setUserid(resultSet.getInt("userid"));
				user.setUsername(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				
			}
			return user; // after statement get execute query due to select statement
			                              // we just need while loop to process the result
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	
	
	@Override
	public boolean insertUser(User user) {
		try (Connection connection = DriverManager.getConnection(properties.getProperty("dbUrl"),
				properties.getProperty("dbUser"), properties.getProperty("dbPassword"));
				PreparedStatement preparedStatement = connection
						.prepareStatement(properties.getProperty("insertUser"))) {
			
			preparedStatement.setInt(1, user.getUserid());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			
			int count = preparedStatement.executeUpdate();
			
			if (count > 0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
         return false;
	}

}
