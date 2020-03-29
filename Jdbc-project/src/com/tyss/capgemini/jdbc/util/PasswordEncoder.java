package com.tyss.capgemini.jdbc.util;

import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;//inside this jar file  bcrypt has hashpassword method

public class PasswordEncoder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the password..");
		
	   String password = scanner.nextLine();
	   System.out.println(password);
	   
	  String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
	  
	  System.out.println(hashedPassword);
	  System.out.println("enter the password for auth");
	  String authPassword = scanner.nextLine();
	  
	  boolean flag =BCrypt.checkpw(authPassword, hashedPassword);
	  System.out.println(flag);
	   
	   scanner.close();
	}

}
