package com.capgemini.assetmanagement.services;

import java.util.HashMap;
import java.util.List;

public interface UserServices {

	public String login(String username, String password);

	public List<HashMap<String, Object>> viewAllAssets();

	public boolean insertAssets(int assetId, String title, String category, int quantity, double price);

	public boolean updateAssets(String title, int quantity);

	public boolean removeAssets(String title);

}
