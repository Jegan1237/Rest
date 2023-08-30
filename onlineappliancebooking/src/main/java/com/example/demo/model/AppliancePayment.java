package com.example.demo.model;



//import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;



@Entity

public class AppliancePayment {

	

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	

	private int PaymentId;
	
	private int paymentdate;
	
	private int PaymentAmount;
	
	private String PaymentStatus;
	
	private String PaymentMethod;

	public int getPaymentId() {
		return PaymentId;
	}

	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}

	public int getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(int paymentdate) {
		this.paymentdate = paymentdate;
	}

	public int getPaymentAmount() {
		return PaymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		PaymentAmount = paymentAmount;
	}

	public String getPaymentStatus() {
		return PaymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	
	
	


	

	

	

	

}