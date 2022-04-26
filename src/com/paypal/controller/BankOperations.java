package com.paypal.controller;

public abstract class BankOperations 
{

	public void addAccount()
	{
		System.out.println("Add Account by BankOperations");
	}
	
	public void removeAccount()
	{
		System.out.println("Remove Account");
	}
	
	public abstract void checkBalance();
	
}
