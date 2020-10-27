package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Transaction;

public class TransactionDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	public TransactionDao() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	public List<Transaction> viewAllTransaction() {
		Query query = em.createQuery("select t from Transaction t", Transaction.class);
		return query.getResultList();
	}
	public void createATransaction(Transaction transaction) {

		tx.begin();
		em.merge(transaction);
		tx.commit();
		System.out.println("Beneficiary added");

	}
	

}
