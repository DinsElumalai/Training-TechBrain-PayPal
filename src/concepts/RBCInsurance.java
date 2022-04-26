package concepts;

public class RBCInsurance implements WorldBank, RBC
{

	public void lendMoney()
	{
		System.out.println("Lend Money");
	}
	
	public void borrowMoney()
	{
		System.out.println("BorrowMoney");
	}
}
