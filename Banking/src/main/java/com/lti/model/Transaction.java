package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_transaction")
public class Transaction {
	@Id
	@SequenceGenerator(name="transSeq", initialValue=1001, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="transSeq")
	@Column(name="transaction_id")
	long transactionId;   //PK
	
	@Column(name="transaction_date")
	LocalDate transactionDate;
	
	@Column(name="transaction_detail")
	String transactionDetail;
	
	@Column(name="account_number")
	long accountNumber;  //FK
	
	@Column(name="debit_credit")
	DebitCredit debitedOrCredited;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionDetail() {
		return transactionDetail;
	}

	public void setTransactionDetail(String transactionDetail) {
		this.transactionDetail = transactionDetail;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public DebitCredit getDebitedOrCredited() {
		return debitedOrCredited;
	}

	public void setDebitedOrCredited(DebitCredit debitedOrCredited) {
		this.debitedOrCredited = debitedOrCredited;
	}
	
	

}
