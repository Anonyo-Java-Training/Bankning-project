package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_beneficiary")

public class Beneficiary {
	@Id
	@Column(name="beneficiary_account_number")
	long beneficiaryAccountNumber;  //PK
	
	@Column(name="beneficiary_ifsc")
	String beneficiaryIfsc;
	
	@Column(name="beneficiary_account_name")
	String beneficiaryAccountName;
	
	@Column(name="account_number")
	long accountNumber;  //fk

	public long getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(long beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getBeneficiaryIfsc() {
		return beneficiaryIfsc;
	}

	public void setBeneficiaryIfsc(String beneficiaryIfsc) {
		this.beneficiaryIfsc = beneficiaryIfsc;
	}

	public String getBeneficiaryAccountName() {
		return beneficiaryAccountName;
	}

	public void setBeneficiaryAccountName(String beneficiaryAccountName) {
		this.beneficiaryAccountName = beneficiaryAccountName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	
	
	
	

}
