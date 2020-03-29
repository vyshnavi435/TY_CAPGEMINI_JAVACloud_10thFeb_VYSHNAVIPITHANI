package com.tyss.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.tyss.capgemini.jdbc.beans.User;
import com.tyss.capgemini.jdbc.services.UserServices;
import com.tyss.capgemini.jdbc.services.UserServicesImpl;

public class DeleteUserController {
	public static void main(String[] args) {

		UserServices userServices = new UserServicesImpl();
		User user=new User();
		Scanner scanner = new Scanner(System.in);
         
		System.out.println("Enter Userid : ");
		int userid=0;
		user.setUserid(Integer.parseInt(scanner.nextLine())); 

		System.out.println("Enter Password : ");
		String password = scanner.nextLine();

		boolean isTrue = userServices.deleteUser(userid, password);
		if (isTrue) {
			System.out.println("deleted..");
		} else {
			System.out.println("Something went wrong..");
		}

	}
}
