package com.paypal.entities;

import com.paypal.service.Bank;

public class ChineseBank implements Bank
{

	
	public void addAccount()
	{
		System.out.println("Add Account from Chinese Bank");
	}
	
	public void removeAccount()
	{
		System.out.println("Remove Account from Chinese Bank");
	}
	
	public void getBalance()
	{
		System.out.println("Get Balance from Chinese Bank");
	}
	
}
