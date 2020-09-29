package com.training.model;

public class InterestCalculator {
	
	private int pricipleInterest;
	private int period;
	private float rateofinterest;
	
	
	public float calculateInterest(int p , int n, float r) {
		System.out.println("3 argument function");
		return this.rateofinterest=(p*r*n)/100; 
		
	}
	
	public float calculateInterest(int p, int  n)
			
		{  
				 int r=1;
				 System.out.println("Interest Rate from FBAccount Class");
				 return this.rateofinterest=(p*r*n)/100;
				 
				 
			} 
		 



	public int getPricipleInterest() {
		return pricipleInterest;
	}


	public void setPricipleInterest(int pricipleInterest) {
		this.pricipleInterest = pricipleInterest;
	}


	public int getPeriod() {
		return period;
	}


	public void setPeriod(int period) {
		this.period = period;
	}


	public float getRateofinterest() {
		return rateofinterest;
	}


	public void setRateofinterest(float rateofinterest) {
		this.rateofinterest = rateofinterest;
	}

	
	
	
}
