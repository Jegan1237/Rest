package com.example.demo.model;





import java.util.List;



import jakarta.persistence.CascadeType;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;



@Entity

public class himodel1 {

	

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="userid")

	private int userId;

	private String userName;

	private String userAdd;

	@OneToMany(cascade = CascadeType.ALL)

	@JoinColumn(name="fk_bid", referencedColumnName = "userid")

	private List<himodel1>bikes;

	public int getUserId() {

		return userId;

	}

	public void setUserId(int userId) {

		this.userId = userId;

	}

	public String getUserName() {

		return userName;

	}

	public void setUserName(String userName) {

		this.userName = userName;

	}

	public String getUserAdd() {

		return userAdd;

	}

	public void setUserAdd(String userAdd) {

		this.userAdd = userAdd;

	}

	public List<himodel1> getBikes() {

		return bikes;

	}

	public void setBikes(List<himodel1> bikes) {

		this.bikes = bikes;

	}

	

	

	

	

	

}

