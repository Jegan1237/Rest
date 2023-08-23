package com.example.demo.model;



//import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;



@Entity

public class ApplianceBook {

	

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	

	private int applianceId;

	

	private int applianceCode;

	private String applianceName;

	private int appliancePrice;

	private int applianceQty;

	private String applianceCity;

	private int applianceWarranty;

	public int getApplianceId() {
		return applianceId;
	}

	public void setApplianceId(int applianceId) {
		this.applianceId = applianceId;
	}

	public int getApplianceCode() {
		return applianceCode;
	}

	public void setApplianceCode(int applianceCode) {
		this.applianceCode = applianceCode;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public int getAppliancePrice() {
		return appliancePrice;
	}

	public void setAppliancePrice(int appliancePrice) {
		this.appliancePrice = appliancePrice;
	}

	public int getApplianceQty() {
		return applianceQty;
	}

	public void setApplianceQty(int applianceQty) {
		this.applianceQty = applianceQty;
	}

	public String getApplianceCity() {
		return applianceCity;
	}

	public void setApplianceCity(String applianceCity) {
		this.applianceCity = applianceCity;
	}

	public int getApplianceWarranty() {
		return applianceWarranty;
	}

	public void setApplianceWarranty(int applianceWarranty) {
		this.applianceWarranty = applianceWarranty;
	}

	


	

	

	

	

}