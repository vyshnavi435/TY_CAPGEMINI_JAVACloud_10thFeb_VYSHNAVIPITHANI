package com.tyss.capgemini.jdbc.controller;

import java.util.List;

import com.tyss.capgemini.jdbc.beans.User;
import com.tyss.capgemini.jdbc.services.UserServices;
import com.tyss.capgemini.jdbc.services.UserServicesImpl;

public class GetAllInfoController {
	public static void main(String[] args) {
	 UserServices userServices = new UserServicesImpl();
	 List<User> list = userServices.getAllUsers();
	 if (list!=null) {
		 for(User user:list) {
			 System.out.println(user);
		 }
		
	} else {
               System.out.println("something went wrong...");
	}
 }
}
