package com.training.model;

public class Account {
	
	private int accountNo;
	
	private String accountHolder;
	
	private float balance;
	
	protected float rateofinterest;
	
	public float getRateofinterest() {
		return rateofinterest;
	}


	public void setRateofinterest(float rateofinterest) {
		this.rateofinterest = rateofinterest;
	}


	public void withdrawMoney(float amountToWithdraw) {
		
		this.balance = this.balance - amountToWithdraw;
		
		System.out.println("Available Balance : "+ this.balance);
		
	}
	
	public void calculateInterest(int p , int n, float r) {
		
		System.out.println("Inside Base class Account ");
		
		this.rateofinterest=this.rateofinterest=(p*r*n)/100; 
		
	}


	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public float getBalance() {
		return balance;
	}
	

}
