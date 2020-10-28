package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Account;
import com.lti.model.Customer;
import com.lti.model.CustomerAddress;
import com.lti.model.CustomerOccupation;

public class CustomerRepositoryImplementation implements CustomerRepository{
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	public CustomerRepositoryImplementation(){
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
	}
	
	public void addACustomerAndAddressAndOccupation(Customer customer){
		tx.begin();
		em.merge(customer);
		tx.commit();
		System.out.println("Customer Applied for Bank account");
	}
	
	public void updateACustomer(Customer customer){
		tx.begin();
		em.merge(customer);
		tx.commit();
		em.close();
		System.out.println("Customer Updated for Bank account");
		return;
	}
	public void updateACustomerAddress(CustomerAddress customerAddress){
		tx.begin();
		em.merge(customerAddress);
		tx.commit();
		em.close();
		System.out.println("Customer Address Updated for Bank account");
		return;
	}
	public void updateACustomerOccupation(CustomerOccupation customerOccupation){
		tx.begin();
		em.merge(customerOccupation);
		tx.commit();
		em.close();
		System.out.println("Customer Occupation Updated for Bank account");
		return;
	}
	
	public boolean LoginCustomer(long customerId, String password){
		String jpql="select c from Customer c where c.customerId=:cid and c.customerPassword=:pwd";
		Query query =em.createQuery(jpql, Customer.class);
		query.setParameter("cid",customerId);
		query.setParameter("pwd",password);
		Customer acc=(Customer)query.getResultList().stream().findFirst().orElse(null);
//		System.out.println(acc.getCustomerPassword());
        if(acc!=null)
            return true;
        else 
            return false;
	}
	
	public void changePassword(int OTPsent, int OTPtyped, Customer customer){
		if(OTPsent==OTPtyped){
			tx.begin();
			em.merge(customer);
			tx.commit();
			System.out.println("Password changed successfully");
		}else if(OTPsent!=OTPtyped){
			System.out.println("Please check your OTP");
		}
	}
	public Customer findCustomer(long customerId){
		String jpql="select c from Customer c where c.customerId=:cid";
		Query query =em.createQuery(jpql, Customer.class);
		query.setParameter("cid",customerId);
		Customer customer=(Customer) query.getResultList().stream().findFirst().orElse(null);
		return customer;
	}
	public CustomerAddress findCustomerAddress(long customerId){
		String jpql="select c from CustomerAddress c where c.customer.customerId=:cid";
		Query query =em.createQuery(jpql, CustomerAddress.class);
		query.setParameter("cid",customerId);
		CustomerAddress customerAddress=(CustomerAddress) query.getResultList().stream().findFirst().orElse(null);
		return customerAddress;
	}
	public CustomerOccupation findCustomerOccupation(long customerId){
		String jpql="select c from CustomerOccupation c where c.customer.customerId=:cid";
		Query query =em.createQuery(jpql, CustomerOccupation.class);
		query.setParameter("cid",customerId);
		CustomerOccupation customerOccupation=(CustomerOccupation) query.getResultList().stream().findFirst().orElse(null);
		return customerOccupation;
	}
}
