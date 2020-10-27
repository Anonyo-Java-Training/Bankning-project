package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Account;

public class AccountRepositoryImplementation implements AccountRepositiory {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	EntityTransaction tx=em.getTransaction();	

	public void createAccount(Account account) {
		tx.begin();
		em.persist(account);
		tx.commit();
		System.out.println("Account is created");
		
	}
	

}
