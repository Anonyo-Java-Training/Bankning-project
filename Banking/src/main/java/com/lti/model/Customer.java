package com.lti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_customer")
public class Customer {
	@Id
	@SequenceGenerator(name="deptSeq", initialValue=7001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="deptSeq")
	@Column(name="department_id")
	long customerId;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="middle_name")
	String middleName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="father_name")
	String fatherName;
	
	@Column(name="customer_email_id")
	String customerEmailId;
	
	@Column(name="mobile_number")
	String mobileNumber;
	
	@Column(name="date_of_birth")
	LocalDate dateOfBirth;
	
	@Column(name="aadhar_number")
	String aadharNumber;
	
	@Column(name="customer_password")
	String customerPassword;

	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	CustomerAddress address;
	
	@OneToOne(mappedBy="customer", cascade=CascadeType.ALL)
	CustomerOccupation occupation;
}
