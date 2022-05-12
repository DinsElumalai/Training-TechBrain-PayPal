package com.paypal.model;

import com.paypal.entities.Profile;
import com.paypal.service.Bank;

public class TempStorage 
{

	
	
	private static Profile userProfiles[] = new Profile[5];
	
	private static Bank userBankAccounts[] = new Bank[5];
	
	
	public static void setProfiles(Profile profile)
	{
		//this.userProfiles[0] = profile;
		for(int i=0; i < userProfiles.length; i++)
		{
			if(userProfiles[i] == null)
			{
				userProfiles[i] = profile;
				break;
			}
		}
	}
	
	public Profile[] getProfiles()
	{
		return userProfiles;
	}
	
	public static void setUserBankAccounts(Bank bankAccount)
	{
		//this.userProfiles[0] = profile;
		for(int i=0; i < userBankAccounts.length; i++)
		{
			if(userBankAccounts[i] == null)
			{
				userBankAccounts[i] = bankAccount;
				break;
			}
		}
	}
	
	public static Bank[] getUserBankAccounts()
	{
		return userBankAccounts;
	}
	
	static
	{
		System.out.println("Static Block");
	}
}
