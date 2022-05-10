package concepts;

public class ImmutableImpl extends ImmutableCls
{

	public void display()
	{
		System.out.println("Hello" + mutableId + " " +  immutableId);
	}
	
	/*public final void immutableDisplay() {
		
		System.out.println(mutableId + " " +  immutableId);
	}*/
}
