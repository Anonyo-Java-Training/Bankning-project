package com.lti.dao;

import com.lti.model.Admin;
import com.lti.model.AdminApprovalType;

public interface AdminRepository {
	public void addAnAdmin(Admin admin);
	public String customerApproval();
	public boolean adminLogin(long adminId, String adminPassword);

}
