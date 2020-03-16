package com.capgemini.assetmanagement.dao;

import java.util.List;

import com.capgemini.assetmanagement.exception.TitleNotFoundException;

import java.util.HashMap;

public interface UserDAO {

	public String login(String username, String password);

	public List<HashMap<String, Object>> viewAllAssets();

	public boolean insertAssets(int assetId, String title, String category, int quantity, double price);

	public boolean updateAssets(String title, int quantity);

	public boolean removeAssets(String title) ;

}
