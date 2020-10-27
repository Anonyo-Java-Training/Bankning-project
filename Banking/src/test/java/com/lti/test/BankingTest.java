package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.ApplyACustomerDao;
import com.lti.model.Customer;
import com.lti.model.CustomerAddress;
import com.lti.model.CustomerOccupation;

public class BankingTest {

ApplyACustomerDao dao=new ApplyACustomerDao();
	
	@Test
	public void applyForBankAccount(){
		Customer customer=new Customer();
		customer.setFirstName("John");
		customer.setLastName("Doe");
		customer.setDateOfBirth(LocalDate.of(1978, 05, 31));
		
		
		CustomerAddress customerAddress=new CustomerAddress();
		customerAddress.setPermanentCity("Kolkata");
		
		CustomerOccupation customerOccupation=new CustomerOccupation();
		customerOccupation.setSourceOfIncome("Job");
		
		customer.setAddress(customerAddress);
		customerAddress.setCustomer(customer);
		
		customer.setOccupation(customerOccupation);
		customerOccupation.setCustomer(customer);
		
		dao.addACustomerAndAddressAndOccupation(customer);
	}
	
	

}
