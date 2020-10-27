package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.model.InternetBanking;

public class InternetBankingImplementation implements InternetBankingRepositiory {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	EntityTransaction tx=em.getTransaction();

	public boolean internetBankingLogin(long id, String password) {
		Query query = em.createQuery("select ib from InternetBanking ib where ib.id=:ibid and ib.password=:pass",InternetBanking.class);
		query.setParameter("ibid", id);
		query.setParameter("pass", password);
		InternetBanking ib=null;
		ib=(InternetBanking)query.getResultList().stream().findFirst().orElse(null);
		if(ib==null){
			return false;
		}
		return true;
	}

	public void changePassword(InternetBanking internetBanking) {
		 tx.begin();
		 em.merge(internetBanking);
		 tx.commit();
		 System.out.println("password changed");
	}
	
	public void addIBanking(InternetBanking ib){
		tx.begin();
		em.persist(ib);
		tx.commit();
		System.out.println("Ib added");
	}

}
