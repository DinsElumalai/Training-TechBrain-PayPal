package concepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{

	public void add(long val1, long val2)
	{
		System.out.println("Result : " + (val1 + val2));
	}
	
	public void add(double val1, double val2)
	{
		System.out.println("Result : " + (val1 + val2));
	}
	
	public void add(long val1, long val2, long val3)
	{
		System.out.println("Result : " + (val1 + val2+ val3));
		
	}
	public void comparePassword(String pswd, String cfpswd)
	{
		try 
		{
			if(pswd.equals(cfpswd))
			{
				System.out.println("Password Matched");
			}
			else
			{
				throw new NullPointerException();
			}
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the age : ");
			int age = scanner.nextInt();
			
			System.out.println("Entered Age is : " + age);
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Hey I got some Arithmetic exception!!!!");
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Hey I got some Input mismatch exception!!!!/..... Reneter the Age ..");
			comparePassword("Hello", "Hello");
		}
		catch(Exception ex)
		{
			System.out.println("Hey I got some exception!!!!" + ex);
		}
		finally 
		{
			System.out.println("Finally....");
			
		}
		
		
	}
	
	public void div(long val1, long val2)
	{
		try 
		{
			System.out.println("Result : " + (val1 / val2));
		}
		catch(Exception ex)
		{
			System.out.println("Hey I got some exception!!!!");
		}
	}
}
