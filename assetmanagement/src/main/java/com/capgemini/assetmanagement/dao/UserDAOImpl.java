package com.capgemini.assetmanagement.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.assetmanagement.Factory.Factory;
import com.capgemini.assetmanagement.exception.TitleNotFoundException;
import com.capgemini.assetmanagement.repository.AssetRepository;
import com.capgemini.assetmanagement.repository.UserRepository;

public class UserDAOImpl implements UserDAO {

	String userRole = null;
	AssetRepository assetRepository = Factory.getAssetRepository();
	UserRepository userRepository = Factory.getUserRepository();
	Logger log = LogManager.getLogger(UserDAOImpl.class);
	List<HashMap<String, Object>> viewNewList = assetRepository.assetTable();

	int count = 0;

	public String login(String username, String password) {

		for (int i = 0; i < userRepository.userTable().size(); i++) {
			if ((username.equals(userRepository.userTable().get(i).get("Uname").toString()))
					&& (password.equals(userRepository.userTable().get(i).get("Password")))) {

				count++;

				if (count > 0) {

					userRole = (String) userRepository.userTable().get(i).get("Role");
					if ("Admin".equals(userRole)) {
						log.info("Successfully logged in as Admin!");

					} else if ("Manager".equals(userRole)) {
						log.info("Successfully logged in as Manager");
					}
				}
			}
		}
		return userRole;

	}

	@Override
	public List<HashMap<String, Object>> viewAllAssets() {

		for (Object r : viewNewList) {
			System.out.println(r);
		}

		return null;
	}

	@Override
	public boolean insertAssets(int assetId, String title, String category, int quantity, double price) {

		HashMap<String, Object> assetHashMap = new HashMap<String, Object>();

		assetHashMap.put("AssetId", assetId);
		assetHashMap.put("Title", title);
		assetHashMap.put("Category", category);
		assetHashMap.put("Quantity", quantity);
		assetHashMap.put("Price", price);

		viewNewList = assetRepository.assetTable();
		viewNewList.add(assetHashMap);

		System.out.println("Assets added successfully !");

		return true;
	}

	@Override
	public boolean updateAssets(String title, int quantity) {

		for (int i = 0; i < viewNewList.size(); i++) {
			if (title.equals(viewNewList.get(i).get("Title"))) {
				count++;
				if (count > 0) {
					viewNewList.get(i).replace("Quantity", quantity);
					System.out.println("Asset quantity successfully updated !");
				} else {
					System.out.println("Asset not found !");
				}
			}
		}

		return false;
	}

	@Override
	public boolean removeAssets(String title) {

		for (int i = 0; i < viewNewList.size(); i++) {
			if (title.equals(viewNewList.get(i).get("Title"))) {
				count++;
				if (count > 0) {
					viewNewList.remove(i);
					System.out.println("Asset removed successfully !");
				} else {
					throw new TitleNotFoundException("nhhhh");
				}

			}

		}

		return true;
	}
}
// public boolean assetRequest(asset)
