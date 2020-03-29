package com.capgemini.assetmanagement.factory;

import com.capgemini.assetmanagement.dao.UserDAOImpl;
import com.capgemini.assetmanagement.repository.AssetRepository;
import com.capgemini.assetmanagement.repository.UserRepository;
import com.capgemini.assetmanagement.services.UserServiceImpl;
import com.capgemini.assetmanagement.services.UserServices;

public class Factory {

	public static UserDAOImpl getUserDAO() {

		return new UserDAOImpl();
	}

	public static UserServices getUserServices() {

		return new UserServiceImpl();

	}

	public static UserRepository getUserRepository() {

		return new UserRepository();
	}

	public static AssetRepository getAssetRepository() {

		return new AssetRepository();
	}
}


