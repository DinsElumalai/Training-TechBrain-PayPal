package com.paypal.view;

import java.util.Scanner;

import com.paypal.controller.AccountController;
import com.paypal.controller.LoginController;
import com.paypal.entities.Account;
import com.paypal.entities.Profile;
import com.paypal.model.TempStorage;
import com.paypal.service.Bank;

public class MenuView 
{
	//Profile userProfile = null;
	LoginController loginController = new LoginController();
	Scanner scanner = new Scanner(System.in);
	
	public void showMenu()
	{
		System.out.println("********* Menu Page ***********");
		System.out.println("Enter 1 to Login, 2 to Register 3 to Exit");
		
		int option = scanner.nextInt();

		
		if(option == 1)
		{
			loginView();
		}
		else if(option == 2)
		{
			registerView();						
			showMenu();
		}
		else
		{
			System.out.println("Invalid option is choosen, Please try again...");
			showMenu();
		}
		
	
	}
	
	public void loginView()
	{
		System.out.println("--------- Login Page --------");
		System.out.println("Enter the Username : ");
		String username = scanner.next();
		
		System.out.println("Enter the Password : ");
		String password = scanner.next();
		
		if(loginController.login(username, password))
		{
			System.out.println("Success Login..");
			
			System.out.println("Enter 1 to American Bank, 2 to Chinese Bank ");
			int option = scanner.nextInt();
			
			boolean result = false;
			
			switch(option)
			{
			case 1:
				result = new AccountController().addUserBankAccount("AmericanBank");
				break;
			case 2:
				result = new AccountController().addUserBankAccount("ChineseBank");
				break;
			default:
				System.out.println("Invalid Option..");
			}
			
			
			if(result)
			{
				System.out.println("Account Added Successfully...");
				for(Bank bankAccount : TempStorage.getUserBankAccounts())
				{
					if(bankAccount != null)
					{
						bankAccount.addAccount();
						bankAccount.getBalance();
						bankAccount.removeAccount();
					}
					
				}
			}
			else
				System.out.println("Retry again...Choose only listed Bank...");
		}
		else
			System.out.println("Login Failed..");
	}
	
	public void registerView()
	{
		System.out.println("------------ Register Page ----------");
		System.out.println("Enter the Name : ");
		String name = scanner.next();
		
		System.out.println("Enter the Age : ");
		int age = scanner.nextInt();
		
		System.out.println("Enter the Mobile : ");
		String mobile = scanner.next();
		
		System.out.println("Enter the Address : ");
		String address = scanner.next();
		
		System.out.println("Enter the Email : ");
		String email = scanner.next();
		
		System.out.println("Enter the Username : ");
		String username = scanner.next();
		
		System.out.println("Enter the Password : ");
		String password = scanner.next();
		
		System.out.println("Confirm the Password : ");
		String cfPassword = scanner.next();
		
		if(loginController.register(name, age, mobile, address, email, username, password, cfPassword))
			System.out.println("Successfull Register..");
		else
			System.out.println("Register Failed..");
	}
}




//datatype var.name = value/data;
/*Account userAccount = new Account();
userAccount.openAccount();
userAccount.showDetails();
userAccount.closeAccount();

Account userAccount2 = new Account("Dinesh", "123456789", "1235896542", "dins", "d123");
userAccount2.openAccount();
userAccount2.showDetails();
userAccount2.closeAccount();*/
