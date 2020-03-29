package com.tyss.capgemini.jdbc.controller;

import java.util.Scanner;

import com.tyss.capgemini.jdbc.beans.User;
import com.tyss.capgemini.jdbc.services.UserServices;
import com.tyss.capgemini.jdbc.services.UserServicesImpl;

public class InsertUserController {
	public static void main(String[] args) {
		
		UserServices userServices = new UserServicesImpl();
		Scanner scanner = new Scanner(System.in);
		User user=new User();

		System.out.println("Enter Userid : ");
		user.setUserid(Integer.parseInt(scanner.nextLine()));

		System.out.println("Enter Username : ");
		user.setUsername( scanner.nextLine());
		
		System.out.println("Enter email : ");
		user.setEmail(scanner.nextLine());
		
		System.out.println("Enter password : ");
		user.setPassword(scanner.nextLine());
		
		
		boolean b= userServices.insertUser(user);
        if(b==true) {
        	System.out.println("queryok");
        }if(b==false) {
        	System.out.println("query not ok");
        }
		
	}

}
