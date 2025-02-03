package day6.carapplication;

public class Car
{
	// List down attributes
	String brand;
	String model;
	String colour;
	double engineSize;
	int numberOfDoors;
	double currentSpeed=0;
	
	Wheels wheels;				// Adding wheels to your car
	
	@Override
	public String toString() {
		return "Brand = " + brand + ", Model = " + model + ", Colour = " + colour + ", Engine Size = " + engineSize
				+ ", Number of Doors = " + numberOfDoors;
	}
	
	public void pressAccelerator()			// First behavior
	{
		currentSpeed+=10;					// Increase current speed by 10
	}
	
	public void pressBrake()				// Second behavior
	{
		currentSpeed-=5;					// Decrease current speed by 5
		
		if(currentSpeed<0)					// To avoid negative speed
		{
			currentSpeed = 0;
		}
	}
}
