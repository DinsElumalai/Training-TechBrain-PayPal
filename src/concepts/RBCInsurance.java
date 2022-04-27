package concepts;

public class RBCInsurance extends RBCBank implements WorldBank, RBC
{

	public void lendMoney()
	{
		System.out.println("Lend Money from RBC Insurance");
	}
	
	public void borrowMoney()
	{
		System.out.println("BorrowMoney");
	}
}
