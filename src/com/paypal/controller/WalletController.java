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
	
	public String addMoneyToWallet()
	{
		return "";
	}
	
	public String transferMoney(int amount, String transferAccount)
	{
		return "";
	}
}
