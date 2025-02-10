package day8.improvedshapeapplication;

import java.util.Scanner;

public class RunProgram
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Creating Triangle 1...");
		System.out.print("Please enter the colour: ");
		String colourTriangle1 = scanner.nextLine();
		System.out.print("Please enter the base value: ");
		double baseTriangle1 = scanner.nextDouble();
		System.out.print("Please enter the height value: ");
		double heightTriangle1 = scanner.nextDouble();
		scanner.nextLine();
		
		Triangle triangle1 = new Triangle(colourTriangle1, baseTriangle1, heightTriangle1);
		
		System.out.println(triangle1);
		
		System.out.print("Changing Triangle 1's colour to: ");
		String newColour = scanner.nextLine();
		
		triangle1.editColour(newColour);
		System.out.println(triangle1);
	}
}
