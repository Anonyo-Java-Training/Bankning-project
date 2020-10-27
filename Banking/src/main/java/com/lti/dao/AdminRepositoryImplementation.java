package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Admin;
import com.lti.model.AdminApprovalType;
import com.lti.model.Customer;

public class AdminRepositoryImplementation {
	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;
	
	public AdminRepositoryImplementation() {
		emf=Persistence.createEntityManagerFactory("pu");
		em=emf.createEntityManager();
		tx=em.getTransaction();
	}
	
	public void addAnAdmin(Admin admin) {
		tx.begin();
		em.merge(admin);
		tx.commit();
		System.out.println("New Admin Added");
	}
	
	public String customerApproval() {
		return "Accepted";
	}
	
	

}
