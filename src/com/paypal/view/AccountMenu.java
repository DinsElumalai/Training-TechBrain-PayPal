package com.paypal.view;

import java.util.Scanner;

import com.paypal.controller.WalletController;

public class AccountMenu 
{
	Scanner scanner = new Scanner(System.in);
	WalletController wallet = new WalletController();
	
	public void displayMenu()
	{
		System.out.println("Enter 1 to Check Balance, 2 to Add money to wallet, 3 to Money Transfer ");
		int option = scanner.nextInt();
		
		switch(option)
		{
		case 1:
			//checkbalance
			showBalance();
			break;
		case 2:
			//Add money
			addMoney();
			break;
		case 3:
			//Transfer
			transferMoney();
			break;
		default:
			System.out.println("Invalid option given ... Retry again....");
		}
		displayMenu();
	}
	
	public void showBalance()
	{
		System.out.println("The Balance in the Wallet is "+ wallet.checkWalletBalance());
	}
	
	public void addMoney()
	{
		System.out.println("Enter the Amount to be added to the Wallet : ");
		int amount = scanner.nextInt();
		
		System.out.println(wallet.addMoneyToWallet(amount));
		System.out.println("The Balance in the Wallet is "+ wallet.checkWalletBalance());
	}
	
	public void transferMoney()
	{
		System.out.println("Enter the Amount to be Transfered : ");
		int amount = scanner.nextInt();
		
		System.out.println("Enter the Account to be Transfered : ");
		String transferAccount = scanner.next();
		
		System.out.println(wallet.transferMoney(amount, transferAccount));
		
	}

}
