package com.capgemini.assetmanagement.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.assetmanagement.exception.TitleNotFoundException;
import com.capgemini.assetmanagement.factory.Factory;
import com.capgemini.assetmanagement.repository.UserRepository;
import com.capgemini.assetmanagement.services.UserServices;

public class LoginController {
	public static void main(String[] args) {

		UserRepository userRepository = Factory.getUserRepository();

		UserServices userServices = Factory.getUserServices();

		int choice = 0;

		String title = null;
		String category = null;
		Integer quantity = 0;
		Double price = 0.0;
		String username = null;
		String password = null;
		int assetId = 0;

		Logger log = LogManager.getLogger(LoginController.class);
		Scanner sc = new Scanner(System.in);

		log.info("Enter Username");
		username = sc.next();
		log.info("Enter Password");
		password = sc.next();
		int count = 0;

		if ("Admin".equals(userServices.login(username, password))) {

			log.info("Select 1 for Inserting Assets");
			log.info("Select 2 for Updating Asset Table");
			log.info("Select 3 for Removing Assets ");
			log.info("Select 4 for Request Form");
			log.info("Select 5 for Status of Assets");
			log.info("Select 6 for Allocated Asset Report");
			log.info("Select 7 for Unallocated Asset Report");

			while (true) {
				log.info("Enter Your Choice of Action : ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					log.info("Enter the AssetId :");
					assetId = sc.nextInt();
					log.info("Enter the title");
					title = sc.next();

					log.info("Enter the category");
					category = sc.next();
					log.info("Enter the quantity");
					quantity = sc.nextInt();
					log.info("Enter the price");
					price = sc.nextDouble();
					userServices.insertAssets(assetId, title, category, quantity, price);
					break;
				case 2:
					log.info("Enter the title you want to update");
					title = sc.next();
					log.info("Enter the number of quantities you want to update");
					quantity = sc.nextInt();

					userServices.updateAssets(title, quantity);
					break;
				case 3:
					log.info("Enter the title you want to remove");
					title = sc.next();

					userServices.removeAssets(title);
//						
					break;
				case 4:
					userServices.viewAllAssets();
					break;
				}
			}
		} else if ("Manager".equals(userServices.login(username, password))) {
			log.info("Select 1 for Viewing All Assets");
			log.info("Select 4 for Raising the Request");
			log.info("Select 5 for Generating My Assets Report");
			log.info("Enter Your Choice of Action : ");

			while (true) {
				log.info("Enter Your Choice of Action : ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					userServices.viewAllAssets();
					break;
				case 2:

				case 3:

				}
			}

		} else {
			log.info("No roles found !");
		}
	}

}
