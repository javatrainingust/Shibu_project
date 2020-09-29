package com.training.model;

public class Current extends Account {
	
	private int overDraftLimit;
	private float Balance;
	
	public void odlimit(int limit) {
		
		if (limit > 25000) {
			System.out.println("Limit Exceeded");
		}
		else {
			System.out.println("Limit Granted");
		}
	}
	
	public int getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	
	

}
