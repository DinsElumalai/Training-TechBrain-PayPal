package concepts;

public class Bank implements BankManager, BankCustomer
{

	@Override
	public void viewAllAccountDetails() 
	{
		// TODO Auto-generated method stub
		System.out.println("View all customers account details");
		
	}

	@Override
	public void viewAccountDetails() 
	{
		// TODO Auto-generated method stub
		System.out.println("View my account details");
	}

	public void updateAccount()
	{
		System.out.println("Update account details");
	}
	
}
