package day7.computerapplication;

public class Laptop extends Portable		// Laptop inherits from Portable
{
	String graphicCard;
	boolean sleeping;
	
	public Laptop(String operatingSystem, String graphicCard)
	{
		super(operatingSystem);
		this.graphicCard = graphicCard;		// Store parameter variable to instance variable
		sleep();					// Sleep mode on whenever laptop object is created
	}
	
	public void sleep()
	{
		sleeping = true;			// Sleep mode is on
	}
	
	public void Wakeup()
	{
		sleeping = false;			// Sleep mode is off
	}
	
}
