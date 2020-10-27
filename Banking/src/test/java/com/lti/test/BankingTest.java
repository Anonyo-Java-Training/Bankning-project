package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.AdminRepositoryImplementation;
import com.lti.dao.ApplyACustomerDao;
import com.lti.model.Admin;
import com.lti.model.Customer;
import com.lti.model.CustomerAddress;
import com.lti.model.CustomerOccupation;

public class BankingTest {

ApplyACustomerDao dao=new ApplyACustomerDao();
AdminRepositoryImplementation set_status=new AdminRepositoryImplementation();
	
	@Test
	public void applyForBankAccount(){
		Customer customer=new Customer();
		customer.setFirstName("John");
		customer.setLastName("Doe");
		customer.setStatus(set_status.customerApproval());
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
	
	@Test
	public void applyAsAdmin() {
		Admin admin=new Admin();
		admin.setAdminName("Mike");
		admin.setAdminPassword("Mike@1234");
		AdminRepositoryImplementation repo=new AdminRepositoryImplementation();
		repo.addAnAdmin(admin);
		
	}
	
	

}
