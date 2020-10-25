package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customer_address")
public class CustomerAddress {
	
	@Id
	@SequenceGenerator(name="addrSeq", initialValue=7001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="addrSeq")
	long addressId;
	
	
	@OneToOne
	@JoinColumn(name="customer_id")
	Customer customer;
	
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



	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getResidentialLandmark() {
		return residentialLandmark;
	}

	public void setResidentialLandmark(String residentialLandmark) {
		this.residentialLandmark = residentialLandmark;
	}

	public String getResidentialState() {
		return residentialState;
	}

	public void setResidentialState(String residentialState) {
		this.residentialState = residentialState;
	}

	public String getResidentialCity() {
		return residentialCity;
	}

	public void setResidentialCity(String residentialCity) {
		this.residentialCity = residentialCity;
	}

	public int getResidentialPincode() {
		return residentialPincode;
	}

	public void setResidentialPincode(int residentialPincode) {
		this.residentialPincode = residentialPincode;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPermanentLandmark() {
		return permanentLandmark;
	}

	public void setPermanentLandmark(String permanentLandmark) {
		this.permanentLandmark = permanentLandmark;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public int getPermanentPincode() {
		return permanentPincode;
	}

	public void setPermanentPincode(int permanentPincode) {
		this.permanentPincode = permanentPincode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


}
