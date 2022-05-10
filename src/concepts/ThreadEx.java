package concepts;

//public class ThreadEx extends Thread
public class ThreadEx implements Runnable
{

	public void run()
	{
		for(int i=0; i<10 ; i++)
		{
			System.out.println("Thread : "+ Thread.currentThread() + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
