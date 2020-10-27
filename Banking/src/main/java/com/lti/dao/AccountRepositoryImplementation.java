package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
	
	public void viewAllAccounts(){		
		Query query=em.createQuery("select a from Account a",Account.class);
		List<Account> accounts =query.getResultList();
		for(Account account:accounts){
		System.out.println(account.getAcccountNumber());
		}
	}
	
	public Account viewAccountDetails(long accountNumber){
		return em.find(Account.class, accountNumber);
	}
	
	public long showBalance(long accountNumber){
		Account account= viewAccountDetails(accountNumber);
		return account.getAccountBalance();
	}
	
	

}
