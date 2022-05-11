package concepts;

import com.paypal.controller.AmericanExpressBank;
import com.paypal.controller.BankOperations;
import com.paypal.model.DAOImpl;

public class ConceptMain 
{
	public static void main(String args[])
	{
		
		/*DAOImpl dao = new DAOImpl();
		dao.selectData();
		dao.insertData(1005, "Zexing", "6859");
		dao.selectData();
		dao.updateData(1004, "75689");
		dao.selectData();
		dao.deleteData(1005);
		dao.selectData();
		dao.closeConnection();*/
		
		ThreadEx thh = new ThreadEx();
		Thread th = new Thread(thh);
		th.start();
		
		ThreadEx thh2 = new ThreadEx();
		Thread th2 = new Thread(thh2);
		th2.start();
		
		ImmutableCls imCls = new ImmutableCls();
		//imCls.immutableId = 10;
		imCls.mutableId = 10;
		ImmutableImpl imImpl = new ImmutableImpl();
		imImpl.mutableId = 10;
		imImpl.display();
		imImpl.immutableDisplay();
		
		
		StringEx strEx = new StringEx();
		strEx.stringExMethod();
		
		String names[] = {"Tanish", "Zexing", "Chen"};
		
		System.out.println(names);
		
		
		int age = 15;
		if(age > 18)
		{
			if(age > 60)
			{
				System.out.println("Senior Citizen");
			}
			else
				System.out.println("Major");
		}
		else if(age < 10)
		{
			System.out.println("Kid");
		}
		else
		{
			System.out.println("Minor");
		}
		
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
		calc.comparePassword("Dinesh", "kumar");
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
