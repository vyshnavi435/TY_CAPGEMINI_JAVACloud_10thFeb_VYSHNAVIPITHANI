package com.tyss.capgemini.beans;

public class UserAdmin {
	
	private int id;
	public UserAdmin(int id, String name, String email, String username, String password,String role) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		
	}
	private String name;
	private String username;
	private String email;
	private String password;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private List<Assets> assets = new ArrayList<Assets>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Assets> getAssets() {
		return assets;
	}
	public void setAssets(List<Assets> assets) {
		this.assets = assets;
	}

}
