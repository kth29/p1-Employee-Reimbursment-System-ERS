package com.revature.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.revature.bean.Request;
import com.revature.bean.User;

public class RequestDaoDB implements RequestDao {

	@Override
	public Request submitRequest(Request r) {
		// TODO Create new request using the currently logged in user
		Transaction tx = null;
		Session session 
		return null;
	}

	@Override
	public Request getRequest(Integer reimbId) {
		// TODO Retrieve specific account using reimbId
		
		return null;
	}

	@Override
	public List<Request> getRequests() {
		// TODO Generate a list of all requests
		
		return null;
	}

	@Override
	public List<Request> getRequestsByUser(User u) {
		// TODO Generate a list of requests by user's userId
		
		return null;
	}

	@Override
	public Request updateRequest(Request r) {
		// TODO Change some value the specified request object
		
		return null;
	}

	@Override
	public boolean removeRequest(Request r) {
		// TODO Delete request from persistence layer
		
		return false;
	}

}
