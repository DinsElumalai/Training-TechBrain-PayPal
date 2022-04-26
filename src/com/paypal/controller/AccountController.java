package com.paypal.controller;

import com.paypal.entities.AmericanBank;
import com.paypal.entities.ChineseBank;
import com.paypal.model.TempStorage;

public class AccountController 
{

	public boolean addUserBankAccount(String bankName)
	{
		
		if(bankName.equals("AmericanBank"))
		{
			TempStorage.setUserBankAccounts(new AmericanBank());
			return true;
		}
		else if(bankName.equals("ChineseBank"))
		{
			TempStorage.setUserBankAccounts(new ChineseBank());
			return true;
		}
		
		
		return false;
	}
}
