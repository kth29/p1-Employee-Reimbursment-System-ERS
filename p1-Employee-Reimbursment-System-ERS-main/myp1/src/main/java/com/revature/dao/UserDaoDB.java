package com.revature.dao;

import java.util.List;

import com.revature.bean.User;

public class UserDaoDB implements UserDao{

	@Override
	public User getUser(Integer userId) {
		// TODO Retrieve specific user by userId
		
		return null;
	}

	@Override
	public User getUser(String username, String password) {
		// TODO For user login
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Generate list of all users
		return null;
	}

	@Override
	public User updateUser(User u) {
		// TODO Change some value of the user object
		return null;
	}

}
