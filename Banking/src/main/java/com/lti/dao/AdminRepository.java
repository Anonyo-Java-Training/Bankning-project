package com.lti.dao;

import com.lti.model.Admin;

public interface AdminRepository {
	public void addAnAdmin(Admin admin);
	public void customerApproval();
	public void adminLogin();

}
