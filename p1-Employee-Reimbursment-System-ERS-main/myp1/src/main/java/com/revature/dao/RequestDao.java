package com.revature.dao;

import java.util.List;

import com.revature.bean.Request;
import com.revature.bean.User;

public interface RequestDao {
	
	/** Adds a new request into the persistence layer
	 * @param r, the request object to add
	 * @return the same request that was added
	 */
	public Request submitRequest(Request r);
	
	/**
	 * Retrieves a request
	 * @param reimbId, the id of the request to retrieve
	 * @return the request object
	 */
	public Request getRequest(Integer reimbId);
	
	
	/** Retrieves all requests
	 * @return a list of all requests
	 */
	public List<Request> getRequests();
	
	
	/** Retrieves requests by a particular user
	 * @param u, the user object to search by
	 * @return a list of requests that the user submitted
	 */
	public List<Request> getRequestsByUser(User u);
	
	
	/**
	 * Updates a specific request
	 * @param r, the request to update
	 * @return the updated request
	 */
	public Request updateRequest(Request r);
	
	
	/** ADDITIONAL FUNCTIONALITY!!!
	 * Deletes a REQUEST from the persistence layer
	 * 
	 * @param Rr the request to delete
	 * @return true if the deletion was successful; false if not
	 */
	public boolean removeRequest(Request r);
	
}
