package com.dao;

import java.util.List;

import com.model.ServiceProvider;

public interface UserDao {
	
	public boolean addUser(ServiceProvider user);
	public boolean updateUser(ServiceProvider user);
	public boolean deleteUser(String username);
	public ServiceProvider findUser(String username);
	public List<ServiceProvider> getAllUsers();
	public boolean isUserExists(String username);
	
	public boolean validateUser(String username,String password);

}
