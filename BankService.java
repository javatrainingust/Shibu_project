package com.training.services;

import com.training.model.Account;
import com.training.model.Fixed;
import com.training.model.Current;
import com.training.model.LoanAccount;
import com.training.model.Savings;
import com.training.model.InterestCalculator;

public class BankService {
	
	public static void main(String args[]) {
		
		Account acc = new Account();
   	 	acc.setAccountNo(1000);
   	 	acc.setAccountHolder("Rahul");
   	 	acc.setBalance(10000);
   	 	acc.withdrawMoney(2000);
		
		//Loan Account class
		LoanAccount la = new LoanAccount();
		la.setAccountHolder("shibu");
		la.setAccountNo(123456);
		System.out.println("Name : "+la.getAccountHolder());
		System.out.println("Acc Number : "+la.getAccountNo());
		la.emiCalc(5,10000);
		System.out.println("EMI : "+la.getEmi());
		
		//Current Account Class
		Current ca = new Current();
		ca.setAccountHolder("Sachin");
		ca.setAccountNo(987987);
		System.out.println("Name : "+ca.getAccountHolder());
		System.out.println("Acc Number : "+ca.getAccountNo());
		ca.setOverDraftLimit(25000);
		ca.odlimit(30000);
		
		//Fixed Account class
		Fixed fa = new Fixed();
		fa.setAccountHolder("Rahul");
		fa.setAccountNo(111111);
		System.out.println("Name : "+fa.getAccountHolder());
		System.out.println("Acc Number : "+fa.getAccountNo());
		fa.setTenure(5);
		fa.calculateInterest(1000, 1, 7);
		System.out.println("Interest Rate for Fixed Account :"+fa.getRateofinterest()); 
		//fa.updateAutoRenewal(3);
		
		//System.out.println("Rate of interest");
   	 	Savings  sa= new  Savings ();
   	 	sa.calculateInterest(50000, 1, 5);
   	 	System.out.println("Interest Rate for Savings Account :"+sa.getRateofinterest());
   	 	//sa.calculateInterest(100000, 3, 5);
   	 	//System.out.println("Interest Rate for Fixed Account :"+sa.getRateofinterest());
   	 	
   	 	InterestCalculator ic = new InterestCalculator();
   	 	ic.calculateInterest(1000, 2);
   	    System.out.println("Interest Rate for Fixed Account :"+ic.getRateofinterest()); 
   	 	ic.calculateInterest(2000, 2, 1); 
   		System.out.println("Interest Rate for Fixed Account :"+ic.getRateofinterest()); 
   	 

		
	}

}
















