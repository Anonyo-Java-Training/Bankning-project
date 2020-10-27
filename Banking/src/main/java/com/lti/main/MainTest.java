package com.lti.main;

import java.time.LocalDate;

import com.lti.dao.AccountRepositiory;
import com.lti.dao.AccountRepositoryImplementation;
import com.lti.dao.InternetBankingImplementation;
import com.lti.dao.InternetBankingRepositiory;
import com.lti.model.Account;
import com.lti.model.AccountType;
import com.lti.model.InternetBanking;

public class MainTest {
	public static void main(String[] args) {
		AccountRepositoryImplementation dao=new AccountRepositoryImplementation();
//		Account account = new Account();
//		account.setAccountBalance(108765);
//		account.setAccountOpeningDate(LocalDate.of(2019,7, 17));
//		account.setAccountType(AccountType.current);
//		account.setIfscCode("TWQAS7876");
//		account.setStatus("active");
//		dao.createAccount(account);
		System.out.println("hellooo");
		InternetBanking ib=new InternetBanking();
	//	ib.setPassword("lti");
		
		InternetBankingImplementation ibr=new InternetBankingImplementation();
		ibr.addIBanking(ib);
		
		
		

	}

}
