package concepts;

import com.paypal.controller.AmericanExpressBank;
import com.paypal.controller.BankOperations;

public class ConceptMain 
{
	public static void main(String args[])
	{
		
		RBCInsurance rbcInsurance = new RBCInsurance();
		rbcInsurance.borrowMoney();
		rbcInsurance.lendMoney();
		rbcInsurance.getCollatral();
		
		RBCBank rbcBank = rbcInsurance;
		rbcBank.lendMoney();
		rbcBank.getCollatral();
		
		
		Calculator calc = new Calculator();
		calc.add(10, 10);
		calc.add(15.5, 15.5);
		calc.add(10, 10, 10);
		calc.div(10, 2);
		calc.div(10, 0);
		calc.comparePassword("Dinesh", "Dinesh");
		calc.comparePassword(null, "Dinesh");
		
		//Example ex = new Example();
				
		BankOperations bankOperations = new AmericanExpressBank();
		bankOperations.addAccount();
				
		Bank bank = new Bank();
		bank.viewAccountDetails();
		bank.viewAllAccountDetails();
		bank.updateAccount();
		
		BankManager bkmgr = bank;
		bkmgr.viewAccountDetails();
		bkmgr.viewAllAccountDetails();
		
		BankCustomer bkcust = bank;
		bkcust.viewAccountDetails();
						
		
		RBCInsurance rbcIns = new RBCInsurance();
		rbcIns.borrowMoney();
		rbcIns.lendMoney();
		
		RBC rbc = new RBCInsurance();
		rbc.lendMoney();
		
		WorldBank worldBank = new RBCInsurance();
		worldBank.borrowMoney();
		
		
		Dog dog = new Dog();
		dog.bark();
		dog.canWalk();
		dog.feedMilk();
		
		Cat cat = new Cat();
		cat.canWalk();
		cat.feedMilk();
		cat.sayMeow();
		
		Mammal mammal = dog;
		mammal.feedMilk();
		Mammal mammal2 = cat;
		mammal2.feedMilk();
		
		Animal animal = dog;
		animal.canWalk();
		Animal animal2 = cat;
		animal2.canWalk();
		
		
		
		
		
	}

}
