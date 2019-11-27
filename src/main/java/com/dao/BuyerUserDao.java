package com.dao;

import java.util.List;

import com.model.UserBuyer;

public interface BuyerUserDao {
	public boolean addUser(UserBuyer user);
	public boolean updateUser(UserBuyer user);
	public boolean deleteUser(String username);
	public UserBuyer findUser(String username);
	public List<UserBuyer> getAllUsers();
	public boolean isUserExists(String username);
	
	public boolean validateUser(String username,String password);

}
