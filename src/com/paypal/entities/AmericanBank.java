package com.paypal.entities;

import com.paypal.service.Bank;

public class AmericanBank implements Bank
{

	public void addAccount()
	{
		System.out.println("Add Account from American Bank");
	}
	
	public void removeAccount()
	{
		System.out.println("Remove Account from American Bank");
	}
	
	public void getBalance()
	{
		System.out.println("Get Balance from American Bank");
	}
}
