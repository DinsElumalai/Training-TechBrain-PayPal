package concepts;

//public final class ImmutableCls 
public class ImmutableCls 
{

	public int mutableId = 0;
	public final int immutableId = 0;
	
	public void display()
	{
		System.out.println(mutableId + " " +  immutableId);
	}
	
	public final void immutableDisplay() {
		
		System.out.println(mutableId + " " +  immutableId);
	}
}
