package com.library.DAO;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Customer;

public class CustomerDAO {
	private static CustomerDAO instance = null;
	private List<Customer> customers;
	
	private CustomerDAO() {
		customers = new ArrayList<Customer>();
	}
	
	public static CustomerDAO getInstance() {
		if(instance == null)
			instance = new CustomerDAO();
		return instance;
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
}
