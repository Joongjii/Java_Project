package com.mc.tour.service;

public class Tourist {
	private int balance;
	private int mileage;
	
	public Tourist() {
		
	}

	public Tourist(int myMoney, int myMile) {
		super();
		this.balance = myMoney;
		this.mileage = myMile;
	}

	public int getMyMoney() {
		return balance;
	}

	public void setMyMoney(int myMoney) {
		this.balance = myMoney;
	}

	public int getMyMile() {
		return mileage;
	}

	public void setMyMile(int myMile) {
		this.mileage = myMile;
	};


	
}
