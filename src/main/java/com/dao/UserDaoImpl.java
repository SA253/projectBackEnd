package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.model.ServiceProvider;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private MongoTemplate mongotemplate;
	
	@Override
	public boolean addUser(ServiceProvider user) {
		System.out.println("Saving the user with details "+ user );
		mongotemplate.save(user);
		
		return true;
	}

	@Override
	public boolean updateUser(ServiceProvider user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ServiceProvider findUser(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		List<ServiceProvider> list = mongotemplate.find(query, ServiceProvider.class);
		return list.get(0) ; //to return only 1 user
	}

	@Override
	public List<ServiceProvider> getAllUsers() {
		
		return mongotemplate.findAll(ServiceProvider.class);
	}

	@Override
	public boolean validateUser(String username, String password) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		query.addCriteria(Criteria.where("password").is(password));
		List<ServiceProvider> list =  mongotemplate.find(query, ServiceProvider.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean isUserExists(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		List<ServiceProvider> list = mongotemplate.find(query, ServiceProvider.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
	}

}
