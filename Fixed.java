package com.training.model;

import com.training.model.InterestCalculator;

public class Fixed extends Account implements Renewable {
	
	private int tenure;
	private boolean autoRenewal;
	
	public void updateAutoRenewal(int year )
    {
	   if (year>tenure)
	   {
		   autoRenewal = true; 
		   System.out.println("Ready for auto renewal");
	   }
	   else
	   {
		   autoRenewal=false;
		   System.out.println("auto renewal possible only after 5 year");
	   }
	
     }
	
	/*public void calculateInterest(int p , int n, float r) {
		
		System.out.println("Interest Rate from FDA Account Class"); 
		
		this.rateofinterest=this.rateofinterest=(p*r*n)/100; 
		
	}*/
	

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public boolean isAutoRenewal() {
		return autoRenewal;
	}

	public void setAutoRenewal(boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	} 
	

}
