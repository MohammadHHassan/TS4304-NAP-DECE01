// Threads allow you to run lines of codes simultaneously

package day11.learningthreads;

public class Message implements Runnable
{
	String name;			// Instance variable name

	public Message(String name)		// Constructor for Message
	{
		this.name = name;		// Storing data from parameter to instance variable name
	}

	@Override
	public void run()
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i + ". " + name);
			
			try
			{
				Thread.sleep(1000);			// Delay for 1 sec / 1000 ms
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	
}
