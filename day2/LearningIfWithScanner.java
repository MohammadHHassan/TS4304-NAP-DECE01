package day2;											// Name of the package

import java.util.Scanner;								// Import Scanner library

public class LearningIfWithScanner						// Name of the class
{
	public static void main(String[] args)				// Main method
	{
		Scanner scanner = new Scanner(System.in);		// Declaration of Scanner class
		
		System.out.print("Please enter a value between 5 and 10: ");
		int input = scanner.nextInt();					// Store user's input in int input
		
		if(input>=5 && input<=10)						// If the condition is between 5 and 10
		{
			System.out.println("The value is within the range.");
		}
		else											// If the value is not between 5 and 10
		{
			System.out.println("The value is NOT in range");
		}
		
		scanner.close();								// Close the scanner
	}
}
