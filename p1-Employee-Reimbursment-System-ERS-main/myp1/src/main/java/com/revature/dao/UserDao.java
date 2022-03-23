package com.revature.dao;

import java.util.List;

import com.revature.bean.User;

public interface UserDao {
	
	/* Retrieves a user by id
	 * @param userId, the id to search by
	 * @return the user object
	 */
	public User getUser(Integer userId);
	
	
	/* Retrieves a user by username & password
	 * @param username, @param password
	 * @return the user object
	 */
	public User getUser(String username, String password);
	
	
	/* Retrieves a list of all users in the persistence layer
	 * @return a list of all users
	 */
	public List<User> getAllUsers();
	
	
	/* Updates a specific user
	 * @param u, the user to search by
	 * @return the newly updated user object
	 */
	public User updateUser(User u);
	

}
