package com.lti.dao;

import com.lti.model.Account;

public interface AccountRepositiory {
	 void createAccount(Account account);
	 Account viewAccountDetails(long accountNumber);
	 long showBalance(long accountNumber);

}
