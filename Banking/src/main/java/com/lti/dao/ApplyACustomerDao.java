package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Customer;

public class ApplyACustomerDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	public ApplyACustomerDao(){
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
}
