package com.tyss.capgemini.jdbc.dao;

import java.util.List;
import com.tyss.capgemini.jdbc.beans.User;

public interface UserDAO {
	public List<User> getAllUsers();

	public User getUser(int userid);

	public boolean insertUser(User user);

	public boolean updateEmail(int userid, String password, String newEmail);

	public boolean deleteUser(int userid, String password);

}
