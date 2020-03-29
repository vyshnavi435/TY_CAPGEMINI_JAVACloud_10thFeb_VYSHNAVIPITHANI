package com.tyss.capgemini.jdbc;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncoder {
	
	private PasswordEncoder() {
		
	}
	public static String passwordEncoder(String plainPassword) {
		return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
	}
       public static boolean passwordChecker(String plainPassword, String hashedPassword) {
    	   return BCrypt.checkpw(plainPassword, hashedPassword);
       }
}
