package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.AccountRepositoryImplementation;
import com.lti.model.Account;
import com.lti.model.AccountType;

public class AccountTest {

	AccountRepositoryImplementation dao = new AccountRepositoryImplementation();

	@Test
	public void createAccount() {
		Account account = new Account();
		account.setAccountBalance(108765);
		account.setAccountOpeningDate(LocalDate.of(2019,7, 17));
		account.setAccountType(AccountType.current);
		account.setIfscCode("TWQAS7876");
		account.setStatus("active");
		dao.createAccount(account);

	}
	
	@Test
	public void viewAllAccounts(){
	  dao.viewAllAccounts();
	}
	
	@Test
	public void showBalance(long accountNumber){
		System.out.println(dao.showBalance(589012372));
	}
	
	@Test
	public void viewAccountDetails(){
		Account account=dao.viewAccountDetails(589012372);
		System.out.println(account.getAcccountNumber()+" "+account.getIfscCode());
	}

}
