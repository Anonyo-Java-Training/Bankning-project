package com.lti.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class CustomerOccupation{
	
	@Column(name="occupation_type")
	String occupationType;
	
	@Column(name="source_of_income")
	String sourceOfIncome;
	
	
	@Column(name="gross_annual_income")
	double grossAnnualIncome;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	Customer customer;
}