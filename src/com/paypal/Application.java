package com.paypal;

import com.paypal.view.MenuView;

public class Application {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("******** PayPal ********");
		
		
		MenuView menu = new MenuView();
		menu.showMenu();

		//Input Output
		String msg = "Hello Welcome";
		String appName = "Paypal";
		int modelId = 123456;
		
		//System.out.println(msg);
		//System.out.println(appName);
		//System.out.println(modelId);
		
		//datatype var.name = value;
		int age = 8;
		
		if(age > 18)
		{
			if(age > 60)
			{
				System.out.println("You're Senior Citizen");
			}
			else
			{
				System.out.println("You're Major");
			}
		}
		else if(age < 10)
		{
			System.out.println("You're Kid");
		}
		else
		{
			System.out.println("You're Minor");
		}
		
		
		
		
		System.out.println("****** Thank you ********");
	}

}
