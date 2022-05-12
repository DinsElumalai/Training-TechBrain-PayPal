package com.paypal.controller;

import com.paypal.entities.Profile;
import com.paypal.exceptions.PasswordMismatchException;
import com.paypal.helper.LoginHelper;
import com.paypal.model.CacheMemory;
import com.paypal.model.FileStorage;
import com.paypal.model.TempStorage;
import com.paypal.view.AccountMenu;

public class LoginController 
{

	LoginHelper helper = new LoginHelper();
	AccountMenu accountMenu = new AccountMenu();
	String result = null;
	
	
	public String login(String userName, String password)
	{
		if(helper.checkLogin(userName).equals(password))
		{
			CacheMemory.loggedUsername = userName;
			accountMenu.displayMenu();
					
		}
		else
			result = "Login Failed";
		
		return result;

	}
	
	public String register(String name, int age, String mobile, String address,String  email,String balance,  String username, String password, String cfPassword) throws PasswordMismatchException
	{
		if(password.equals(cfPassword))
		{
			Profile profile = new Profile();
			profile.setName(name);
			profile.setAge(age);
			profile.setMobile(mobile);
			profile.setAddress(address);
			profile.setEmail(email);
			profile.setUsername(username);
			profile.setPassword(password);
			profile.setBalance(balance);
			
			if(helper.registerUser(profile))
			{
				return "Registration Successful";
			}
			else
			{
				CacheMemory.loggedUsername = "";
				return "Registration Failed";
			}
			
		}
		else
		{
			throw new PasswordMismatchException();
		}
			
		
		
	}
}

/*TempStorage db = new TempStorage();
Profile userProfiles[] = db.getProfiles();

boolean result = false;

for(int i=0; i < userProfiles.length; i++)
{
	if(userProfiles[i].getUsername().equals(userName) && userProfiles[i].getPassword().equals(password))
	{
		result = true;
		break;
	}
	else
		result = false;
}

return result;

//TempStorage db = new TempStorage();
			FileStorage tempDB = new FileStorage();
			//db.setProfiles(new Profile(name, age, mobile, address, email, username, password));
			
			tempDB.setProfiles(new Profile(name, age, mobile, address, email, username, password));
						
			/*Profile userProfiles[] = db.getProfiles();
			for(int i=0; i < 5; i++) 
			{
				System.out.println(userProfiles[i]);
				
			}*/
