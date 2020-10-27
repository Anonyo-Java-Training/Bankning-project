package com.lti.dao;

import com.lti.model.InternetBanking;

public interface InternetBankingRepositiory {
	boolean internetBankingLogin(long id, String password);
	public void changePassword(InternetBanking internetBanking);
}
