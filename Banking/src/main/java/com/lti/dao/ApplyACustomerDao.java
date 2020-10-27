package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Account;
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
	
	public boolean LoginCustomer(long customerId, String password){
		String jpql="select c from Customer c where c.customerId=:cid and c.customerPassword=:pwd";
		Query query =em.createQuery(jpql, Customer.class);
		query.setParameter("cid",customerId);
		query.setParameter("pwd",password);
		Customer acc=(Customer)query.getResultList().stream().findFirst().orElse(null);
        if(acc!=null)
            return true;
        else
            return false;
	}
}
