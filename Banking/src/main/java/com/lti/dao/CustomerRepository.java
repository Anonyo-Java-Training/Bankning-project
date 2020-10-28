package com.lti.dao;

import com.lti.model.Customer;

public interface CustomerRepository {
	public void addACustomerAndAddressAndOccupation(Customer customer);
	public boolean LoginCustomer(long customerId, String password);
	public void changePassword(int OTPsent, int OTPtyped, Customer customer);
	public Customer findCustomer(long customerId);
}
