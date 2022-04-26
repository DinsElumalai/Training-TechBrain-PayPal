package concepts;

import com.paypal.controller.AmericanExpressBank;

public class Concepts {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Inheritance Example
		
		AmericanExpressBank americanExpr = new AmericanExpressBank();
		americanExpr.addAccount();
		americanExpr.checkBalance();
		americanExpr.removeAccount();
		
		
		
		//initialization; Condition; incre/decre
		for(int i=0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		for(int i=10; i > 0; i--)
		{
			System.out.println(i);
		}
		
		int i = 60;
		while(i<50)  //60 < 50
		{
			System.out.println(i);
			i++;
		}
		
		int j = 100;
		do {
			System.out.println(j);
			j++;
			
		}while(j < 90);

	}

}
