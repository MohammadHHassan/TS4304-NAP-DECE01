package day7.computerapplication;

public class Smartphone extends Portable		// Smartphone inherits from Portable
{
	double cameraMegapixel;
	boolean display;
	
	public Smartphone(String operatingSystem, double cameraMegapixel)
	{
		super(operatingSystem);
		this.cameraMegapixel = cameraMegapixel;		// Pass the data from parameter to instance variable
		switchOffDisplay();
	}
	
	public void switchOnDisplay()
	{
		display = true;
	}
	
	public void switchOffDisplay()
	{
		display = false;
	}
}
