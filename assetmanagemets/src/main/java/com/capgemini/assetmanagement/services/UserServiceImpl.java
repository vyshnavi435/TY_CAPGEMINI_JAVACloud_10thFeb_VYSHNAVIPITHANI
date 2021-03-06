package com.capgemini.assetmanagement.services;

import java.util.HashMap;
import java.util.List;

import com.capgemini.assetmanagement.dao.UserDAOImpl;


public class UserServiceImpl implements UserServices {

	UserDAOImpl userDAO = new UserDAOImpl();

	@Override
	public String login(String username, String password) {

		return userDAO.login(username, password);
	}

	@Override
	public List<HashMap<String, Object>> viewAllAssets() {

		return userDAO.viewAllAssets();
	}

	@Override
	public boolean insertAssets(int assetId, String title, String category, int quantity, double price) {

		return userDAO.insertAssets(assetId, title, category, quantity, price);
	}

	@Override
	public boolean updateAssets(String title, int quantity) {

		return userDAO.updateAssets(title, quantity);
	}

	@Override
	public boolean removeAssets(String title) {

		return userDAO.removeAssets(title);
	}

}
