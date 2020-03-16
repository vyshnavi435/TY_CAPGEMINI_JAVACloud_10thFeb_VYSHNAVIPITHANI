package com.capgemini.assetmanagement.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListofAdmin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Admin> list = new ArrayList<>();

		System.out.println("Enter the number of admin info you want to store :");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter user id : ");
			int userid = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter first name :");
			String fname = sc.nextLine();

			System.out.println("Enter last name :");
			String lname = sc.nextLine();

			System.out.println("Enter user name :");
			String uname = sc.nextLine();

			System.out.println("Enter email id :");
			String email = sc.nextLine();

			System.out.println("Enter password :");
			String password = sc.nextLine();

			Admin admin = new Admin(userid, fname, lname, uname, email, password);
			list.add(admin);
		}
		for (Admin a : list) {
			System.out.println(a);
		}

		sc.close();
	}

}
