package com.capgemini.assetmanagement.repository;

import java.util.*;

import com.capgemini.assetmanagement.beans.UsersBean;

public class UserRepository {

	public List<HashMap<String, Object>> userTable() {

		List<HashMap<String, Object>> userArrayList = new ArrayList<>();
		
		HashMap<String, Object> userhashMap1 = new HashMap<String, Object>();

		UsersBean user1 = new UsersBean(101, "Chandler Bing", "chandlerbing", "chandler@123", "chandler@gmail.com","User");
				
		userhashMap1.put("UserId", user1.getId());
		userhashMap1.put("Name", user1.getName());
		userhashMap1.put("Uname", user1.getUsername());
		userhashMap1.put("Password", user1.getPassword());
		userhashMap1.put("Email", user1.getEmail());
		userhashMap1.put("Role", user1.getRole());
		
		userArrayList.add(userhashMap1);

		HashMap<String, Object> userhashMap2 = new HashMap<String, Object>();
		
		UsersBean user2 = new UsersBean(102, "Monica Geller", "monicageller", "monica@123", "monica@gmail.com","Admin");
		
		userhashMap2.put("UserId", user2.getId());
		userhashMap2.put("Name", user2.getName());
		userhashMap2.put("Uname", user2.getUsername());
		userhashMap2.put("Password", user2.getPassword());
		userhashMap2.put("Email", user2.getEmail());
		userhashMap2.put("Role", user2.getRole());

		userArrayList.add(userhashMap2);

		HashMap<String, Object> userhashMap3 = new HashMap<String, Object>();
		
		UsersBean user3 = new UsersBean(103, "Rachel", "rachel", "rachel@123", "rachel@gmail.com", "Manager");
		
		userhashMap3.put("UserId", user3.getId());
		userhashMap3.put("Name", user3.getName());
		userhashMap3.put("Uname", user3.getUsername());
		userhashMap3.put("Password", user3.getPassword());
		userhashMap3.put("Email", user3.getEmail());
		userhashMap3.put("Role", user3.getRole());
		
		userArrayList.add(userhashMap3);

		HashMap<String, Object> userhashMap4 = new HashMap<String, Object>();
		
		UsersBean user4 = new UsersBean(104, "Ross Geller", "rossgeller", "ross@123", "ross@gmail.com", "User");
		
		userhashMap4.put("UserId", user4.getId());
		userhashMap4.put("Name", user4.getName());
		userhashMap4.put("Uname", user4.getUsername());
		userhashMap4.put("Password", user4.getPassword());
		userhashMap4.put("Email", user4.getEmail());
		userhashMap4.put("Role", user4.getRole());
		
		userArrayList.add(userhashMap4);

		HashMap<String, Object> userhashMap5 = new HashMap<String, Object>();
		
		UsersBean user5 = new UsersBean(105, "Phoebe Buffay", "phoebebuffay", "phoebe@123", "phoebe@gmail.com","Manager");
				
		userhashMap5.put("UserId", user5.getId());
		userhashMap5.put("Name", user5.getName());
		userhashMap5.put("Uname", user5.getUsername());
		userhashMap5.put("Password", user5.getPassword());
		userhashMap5.put("Email", user5.getEmail());
		userhashMap5.put("Role", user5.getRole());
		
		userArrayList.add(userhashMap5);

		HashMap<String, Object> userhashMap6 = new HashMap<String, Object>();
		
		UsersBean user6 = new UsersBean(105, "Joey Tribbianni", "joeytribbianni", "joey@123", "joey@gmail.com", "User");
		
		userhashMap6.put("UserId", user6.getId());
		userhashMap6.put("Name", user6.getName());
		userhashMap6.put("Uname", user6.getUsername());
		userhashMap6.put("Password", user6.getPassword());
		userhashMap6.put("Email", user6.getEmail());
		userhashMap6.put("Role", user6.getRole());
		
		userArrayList.add(userhashMap6);
		
		return userArrayList;

	}
}





















