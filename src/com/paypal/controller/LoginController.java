package com.paypal.controller;

import com.paypal.entities.Profile;
import com.paypal.model.TempStorage;

public class LoginController 
{

	
	public boolean login(String userName, String password)
	{
		TempStorage db = new TempStorage();
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

	}
	
	public boolean register(String name, int age, String mobile, String address,String  email, String username, String password, String cfPassword)
	{
		if(password.equals(cfPassword))
		{
			TempStorage db = new TempStorage();
			//db.setProfiles(new Profile(name, age, mobile, address, email, username, password));
			
			TempStorage.setProfiles(new Profile(name, age, mobile, address, email, username, password));
						
			Profile userProfiles[] = db.getProfiles();
			for(int i=0; i < 5; i++) 
			{
				System.out.println(userProfiles[i]);
				
			}
			return true;
		}
		else
			return false;
		
	}
}
