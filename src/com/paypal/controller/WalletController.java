package com.paypal.controller;

import com.paypal.helper.WalletHelper;

public class WalletController 
{

	String result = "";
	WalletHelper helper = new WalletHelper();
	
	public String checkWalletBalance()
	{
		result = helper.getWalletBalance();
		return result;
	}
	
	public String addMoneyToWallet(int amount)
	{
		int existingBalance = Integer.parseInt(helper.getWalletBalance());
		
		amount = amount + existingBalance;
		
		if(helper.updateWalletBalance(amount) > 0)
			result = "Money Added Successfully";
		else
			result = "There is a problem  in adding money to your wallet";
					
		return result;
	}
	
	public String transferMoney(int amount, String transferAccount)
	{
		int existingBalance = Integer.parseInt(helper.getWalletBalance());
		
		if(existingBalance >= amount)
		{
			amount = existingBalance - amount;
			if(helper.updateWalletBalance(amount) > 0)
				result = "Money Trasferred Successfully";
			else
				result = "There is a problem  in transferring money from your wallet";
		}else
			result = "Insufficient Balance, Your current Balance is : " + existingBalance;
			
		
		return result;
	}
}
