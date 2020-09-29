package com.training.RenewalManagement.services;

import com.training.model.Renewable;
import com.training.model.Account;
import com.training.model.Fixed;

public class RenewalManagementService {
	
	public static void main(String args[]) {
		
		Renewable r = new Fixed();
		
		r.updateAutoRenewal(2);
	}

}
