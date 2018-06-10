package com.db.dao;

import java.sql.SQLException;
import java.util.List;

import com.db.model.UserInfo;

public interface UserDao {

	public List<UserInfo> listUsers();

	public void editUser(UserInfo user);

	public void addNewUser(UserInfo user);

	public UserInfo getCurrentUserInfo();
	
	public void giveCustomerPrivileges(UserInfo user);
	
	public void giveAdminPrivileges(UserInfo user);

	public UserInfo getUser(String userName) throws SQLException;

}
