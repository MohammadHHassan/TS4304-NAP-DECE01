package day7.computerapplication;

public class Portable extends Computer		// Portable inherits from Computer
{
	int batteryCapacity=0;					// Instance variable
	
	// Constructor of portable with parameter variable operatingSystem
	public Portable(String operatingSystem)
	{
		super(operatingSystem);				// Inherited attribute
	}
	
	public int getBatteryCapacity()			// Method to get the battery capacity
	{
		return batteryCapacity;				// Return the battery capacity value
	}
	
	public void chargeBattery(int percentage)
	{
		batteryCapacity += percentage;		// batteryCapacity = batteryCapacity+percentage
		
		if(batteryCapacity>100)
		{
			batteryCapacity = 100;			// Battery capacity maxed at 100%
		}
	}
	
	public void useBattery()
	{
		batteryCapacity -= 10;			// Decrease the battery capacity by 10%
		
		if(batteryCapacity<0)
		{
			batteryCapacity = 0;		// Avoid negative value on battery capacity
		}
	}
}
