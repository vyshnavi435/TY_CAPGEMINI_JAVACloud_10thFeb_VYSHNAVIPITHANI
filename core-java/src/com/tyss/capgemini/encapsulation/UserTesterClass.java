package com.tyss.capgemini.encapsulation;

public class UserTesterClass {
	
	private static User setUser(String username, String password, Integer userid) {
		return new User(username, password, userid);
		 
		
	}
	public static void main(String[] args) {
		User user1 = new User("Mike", "querty", 2020001); // setting parameters using construing
		User user2 = new User();
		user2.setUsername("vysh");
		user2.setUserid(202023);
		user2.setPassword("password");
		
		System.out.println("userName: " + user1.getUsername()); // getting character using tostring
		System.out.println("user_id: "+user1.getUserid());
		System.out.println(user1);
		System.out.println(user2);
		
	}

}
