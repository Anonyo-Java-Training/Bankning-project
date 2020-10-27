package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.Beneficiary;
import com.lti.model.Customer;

public class BeneficiaryDao {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	public BeneficiaryDao() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}
	public void addABeneficiary(Beneficiary beneficiary) {

		tx.begin();
		em.merge(beneficiary);
		tx.commit();
		System.out.println("Beneficiary added");

	}
	
	public List<Beneficiary> viewAllBeneficiary() {
		Query query = em.createQuery("select b from Beneficiary b", Beneficiary.class);
		return query.getResultList();
	}

}
