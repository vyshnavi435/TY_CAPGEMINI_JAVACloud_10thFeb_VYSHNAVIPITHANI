package com.capgemini.assetmanagement.beans;

public class UsersBean {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String email;
	private String role;

	public UsersBean(Integer id, String name, String username, String password, String email, String role) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}

	public Integer getId() {
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UsersBean [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", role=" + role + "]";
	}

}
