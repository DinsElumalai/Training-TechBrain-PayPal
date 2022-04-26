package concepts;

public class Cat implements Mammal, Animal
{

	@Override
	public void canWalk() {
		// TODO Auto-generated method stub
		System.out.println("Walking");
		
	}

	@Override
	public void feedMilk() {
		// TODO Auto-generated method stub
		System.out.println("Feeding Milk");
	}

	public void sayMeow()
	{
		System.out.println("Meow");
	}
}
