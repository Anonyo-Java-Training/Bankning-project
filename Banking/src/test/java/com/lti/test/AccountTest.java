package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.AccountRepositiory;
import com.lti.dao.AccountRepositoryImplementation;
import com.lti.model.Account;

public class AccountTest {
	
	AccountRepositiory dao=new AccountRepositoryImplementation();

	@Test
	public void createAccount() {
		Account account =new Account();
		account.setAccountBalance(12345);
		account.setAccountOpeningDate(LocalDate.of(2020, 10, 27));
		account.setAccountType("saving");
		account.setIfscCode("ALCD12345");
		account.setStatus("active");
		dao.createAccount(account);
		
	}

}
