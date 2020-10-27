package com.lti.test;

import java.util.List;

import org.junit.Test;

import com.lti.dao.BeneficiaryDao;
import com.lti.model.Account;
import com.lti.model.Beneficiary;

public class BeneficiaryTest {
	BeneficiaryDao dao=new BeneficiaryDao();

	@Test
	public void addBeneficiary() {
		Beneficiary beneficiary=new Beneficiary();
		beneficiary.setBeneficiaryAccountName("UserName");
		beneficiary.setBeneficiaryAccountNumber(1123332);
		beneficiary.setBeneficiaryIfsc("LTI123");
		dao.addABeneficiary(beneficiary);
	}
	@Test
	public void viewAllBeneficiary() {
		List <Beneficiary> beneficiaries=dao.viewAllBeneficiary();
		for(Beneficiary b:beneficiaries) {
			System.out.println(b.getBeneficiaryAccountName()+" "+b.getBeneficiaryAccountNumber()
			+" "+b.getBeneficiaryIfsc()+" "+b.getAccount());
			
		}
		
	}

}
