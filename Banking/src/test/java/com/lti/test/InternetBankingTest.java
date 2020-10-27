package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.InternetBankingImplementation;

public class InternetBankingTest {
	InternetBankingImplementation dao=new InternetBankingImplementation();

	@Test
	public void internetBankingLogin() {
		System.out.println(dao.internetBankingLogin(1023,"ltio"));
	}

}
