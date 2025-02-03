package day6.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		// Instantiate car1 object
		Car car1 = new Car();			// Create your first car object
		car1.brand = "Toyota";
		car1.model = "Yaris";
		car1.colour = "Red";
		car1.engineSize = 1.6;
		car1.numberOfDoors = 5;
		
		System.out.println("Car 1: " + car1);
		
		// Instantiate car2 object
		Car car2 = new Car();			// Create your second car object
		car2.brand = "Kia";
		car2.model = "Carnival";
		car2.colour = "Blue";
		car2.engineSize = 3.5;
		car2.numberOfDoors = 5;
		
		System.out.println("Car 2: " + car2);
		
		System.out.println("Current speed of car 2 = " + car2.currentSpeed + " km/h");
		car2.pressAccelerator();
		car2.pressAccelerator();
		System.out.println("Speed of car 2 after accelerating = " + car2.currentSpeed + " km/h");
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		System.out.println("Speed of car 2 after braking = " + car2.currentSpeed + " km/h");
		
		Wheels wheel1 = new Wheels();
		wheel1.brand = "LingLong";
		wheel1.size = 16;
		
		Wheels wheel2 = new Wheels();
		wheel2.brand = "Bridgestone";
		wheel2.size = 19;
		
		car1.wheels = wheel1;
		car2.wheels = wheel2;
		
		System.out.println("Car 1 wheels = " + car1.wheels);
		System.out.println("Car 2 wheels = " + car2.wheels);
	}
}
