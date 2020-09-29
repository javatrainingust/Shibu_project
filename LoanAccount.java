package com.training.model;

public class LoanAccount extends Account {
	
	private float emi;
	private float loanOutStanding;
	private int tenure;
	private float balance;
	
	public void emiCalc(int tenure, int amount) {
		 this.emi = ((amount*5)/(tenure*100));
		 
	}
	
	
	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	public float getEmi() {
		return emi;
	}
	public void setEmi(float emi) {
		this.emi = emi;
	}
	public float getLoanOutStanding() {
		return loanOutStanding;
	}
	public void setLoanOutStanding(float loanOutStanding) {
		this.loanOutStanding = loanOutStanding;
	}


}
