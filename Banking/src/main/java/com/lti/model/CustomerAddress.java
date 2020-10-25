package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customer_address")
public class CustomerAddress {
	
	@Column(name="residential_address")
	String residentialAddress;
	
	@Column(name="residential_landmark")
	String residentialLandmark;
	
	@Column(name="residential_state")
	String residentialState;
	
	@Column(name="residential_city")
	String residentialCity;
	
	@Column(name="residential_pincode")
	int residentialPincode;
	
	@Column(name="permanent_address")
	String permanentAddress;
	
	@Column(name="permanent_landmark")
	String permanentLandmark;
	
	@Column(name="permanent_state")
	String permanentState;
	
	@Column(name="permanent_city")
	String permanentCity;
	
	@Column(name="permanent_pincode")
	int permanentPincode;

	@OneToOne
	@JoinColumn(name="customer_id")
	Customer customer;
}
