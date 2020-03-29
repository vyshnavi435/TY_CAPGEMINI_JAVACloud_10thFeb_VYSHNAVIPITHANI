package com.tyss.capgemini.jdbc.services;

import java.util.List;

import com.tyss.capgemini.jdbc.PasswordEncoder;
import com.tyss.capgemini.jdbc.beans.User;
import com.tyss.capgemini.jdbc.dao.UserDAO;
import com.tyss.capgemini.jdbc.dao.UserDAOImpl;

public class UserServicesImpl implements UserServices{

	UserDAO userDAO = new UserDAOImpl();
	@Override
	public List<User> getAllUsers() {
		
		return userDAO.getAllUsers();
	}
	
	@Override
	public boolean deleteUser(int userid, String password) {
		if(PasswordEncoder.passwordChecker(password, getUser(userid).getPassword())) {
			return userDAO.deleteUser( userid, getUser(userid).getPassword());
		}
			return false;
		}
	
	
	@Override
	public boolean insertUser(User user) {
		
		user.setPassword(PasswordEncoder.passwordEncoder(user.getPassword()));
		return userDAO.insertUser(user);
	}
	
	@Override
	public boolean updateEmail(int userid, String password, String email) {
		if(PasswordEncoder.passwordChecker(password, getUser(userid).getPassword())) {
		return userDAO.updateEmail( userid, getUser(userid).getPassword(), email);
	}
		return false;
	}

	@Override
	public User getUser(int userid) {
		return userDAO.getUser(userid);
	}
}
