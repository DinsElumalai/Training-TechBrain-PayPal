package com.paypal.entities;

public class Account 
{
	//data members
	private String accountNumber;
	private String accountName;
	private String mobile;
	private String username;
	private String password;
	

	//member functions
	public void openAccount()
	{
		System.out.println("Opening an account");
	}
	
	public void closeAccount()
	{
		System.out.println("Closing the Account");
	}
	
	public void showDetails()
	{
		System.out.println("Account : " + accountNumber + " " + accountName + " " +
							mobile + " " + username + " " + password);
	}
	
	//default constructor
	public Account()
	{
		this.accountName = "Guest";
		this.accountNumber = "00000";
		this.mobile = "0000000";
		this.username = "User";
		this.password = "Password";
	}
	
	//parameterized constructor
	public Account(String acName, String acNo, String mob, String user, String pswd)
	{
		this.accountName = acName;
		this.accountNumber = acNo;
		this.mobile = mob;
		this.username = user;
		this.password = pswd;
	}
}
